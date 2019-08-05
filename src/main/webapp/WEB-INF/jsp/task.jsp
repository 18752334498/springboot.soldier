<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
    String path = request.getContextPath();//springboot默认根路径是 '/'，可以在属性文件进行配置
			String base = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path
					+ "/";
%>
<html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Title</title>
<base href="<%=base%>" />
<script type="text/javascript" src="/easyui/jquery.min.js"></script>

<link rel="stylesheet" type="text/css"
	href="/easyui//themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="/easyui//themes/icon.css">
<script type="text/javascript" src="/easyui/jquery.min.js"></script>
<script type="text/javascript" src="/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="/easyui/locale/easyui-lang-zh_CN.js"></script>
<style type="text/css">
	#right{
		margin-bottom: 16px;
	}
	#con_p span{
		margin-right: 40px;
	}
</style>
<script type="text/javascript">
	var url = window.location.search.substring(1);
	var arr = url.split("&");
	var username = arr[0].substring(9);
	var password = arr[1].substring(9);
	var obj = JSON.parse('${sessionScope.user}');
	
	var sessionId = obj[username];
	var name = obj[password].userName;
	
	var procType = "";
	var taskId = "";

	$(function() {
		$('#process').combobox({
			url: '/soldier/dropDown',
			method: 'POST',
			valueField : 'value',
			textField : 'label',
			label: '流程业务：',
			labelPosition: 'top',
			editable: false
		});
		
		$('#soldier').textbox({
			label: '军人搜索：',
			labelPosition: 'top',
		    buttonText:'Search',
		    iconCls:'icon-man',
		    iconAlign:'left',
		    onClickButton: function(){
		    	var IDNumber = $('#soldier').textbox('getValue');
		    	if(IDNumber == null || IDNumber == ""){
		    		$.messager.alert('消息','请填写身份证号！','info');
		    	}
		    	$.ajax({
					url:'/soldier/findSoldier',
					data:{"IDNumber":IDNumber,"username":username},
					type:'POST',
					dataType:'json',
					success:function(data){
						soldierId = data.soldierId;
						$('#name').textbox('setValue', data.name);
						$('#number').textbox('setValue', data.idNumber);
						$('#soldierId').textbox('setValue', data.soldierId);
					}
				});
		    }
		})
		$('#request').textbox({
			label: '申请诉求：',
			labelWidth: '60',
			labelPosition: 'top'
		})
		$('#reason').textbox({
			label: '审批意见：',
			labelWidth: '60',
			labelPosition: 'top'
		})
		$('#name').textbox({
			label: '姓名：',
			labelWidth: '60',
			labelPosition: 'left'
		})
		$('#number').textbox({
			label: '身份证：',
			labelWidth: '60',
			labelPosition: 'left'
		})
		$('#soldierId').textbox({
			label: '申请人：',
			labelWidth: '60',
			labelPosition: 'left'
		})

		$('#task').datagrid({
		    url:'/soldier/findProcessByRole',
		    columns:[[
		        {field:'procDefName',title:'业务流程',width:100},
		        {field:'applyName',title:'申请人',width:100},
		        {field:'applyRequest',title:'申请诉求',width:100},
		        {field:'createDate',title:'申请时间',width:120,formatter:function(value,row,index){
		        	return getNowFormatDate(value);
		        }},
		        {field:'sourceName',title:'类型',width:100},
		        {field:'status',title:'状态',width:100,formatter:function(value,row,index){
		        	if(value == "1"){return "成功";
		    		} else if (value == "2"){return "拒绝";
		    		} else {return "进行中";
		    		}
		        }},
		        {field:'opt',title:'操作',width:100,formatter:function(value,row,index){
		        	return "<a id='sp' href='javascript:void(0)' onclick='spClick("+JSON.stringify(row)+")'>审批</a>&nbsp;&nbsp;"
		        		  +"<a id='ck' href='javascript:void(0)' onclick='ckClick("+JSON.stringify(row)+")'>查看</a>";
		        }},
		        {field:'procType',title:'流程类型',width:100,hidden:true},
		        {field:'applyId',title:'申请人ID',width:100,hidden:true},
		        {field:'procInstId',title:'流程实例',width:100,hidden:true},
		        {field:'taskId',title:'任务ID',width:100,hidden:true},
		        {field:'sourceId',title:'类型ID',width:100,hidden:true}
		    ]],
		    queryParams: {"procType":"policy","username":username},
		    pagination: true,
		    rownumbers: true,
		    singleSelect: true,
		    fitColumns: true,
		    striped: true
		});
		
		$('#spDialog').window({
		    title: '审批面板',
		    width: 600,
		    height: 400,
		    closed: true,
		    modal: true
		});
		$('#ckDialog').window({
		    title: 'My Dialog',
		    width: 600,
		    height: 400,
		    closed: true,
		    modal: true
		});
	});
	
	function spClick(row){
		taskId = row.taskId;
		procType = row.procType;
		
		$('#nextStep').combobox({
			url: '/soldier/nextStep',
			method: 'POST',
			queryParams: {
				"username": username,
				"taskId": taskId
			},
			valueField : 'value',
			textField : 'label',
			label: '流程审批：',
			labelPosition: 'top',
			editable: false
		});
		
		$('#spDialog').window("open");
	}
	
	function ckClick(row){
		$('#ckDialog').window("open");
		
		var procInstId = row.procInstId;
		$.ajax({
			url:'/soldier/processDetail',
			data:{"procInstId":procInstId,"username":username},
			type:'POST',
			dataType:'json',
			success:function(data){
				$("#con").empty();
				console.log(data);
				for (i = 0; i < data.length; i++) { 
					$("#con").append("<p id='con_p'><span>"+data[i].deptFullName+"</span> <span>"+data[i].name+"</span> <span>"+data[i].reason+"</span></p>");
				}
			}
		});
	}
	
	function startClick(){
		var procType = $('#process').combobox('getValue');
		var soldierId = $('#soldierId').textbox('getValue');
		var request = $('#request').textbox('getValue');
		if(thisIsNull(procType)){
			$.messager.alert('消息','请填写具体流程！','info');
			return;
		}
		if(thisIsNull(soldierId)){
			$.messager.alert('消息','请填写申请人ID！','info');
			return;
		}
		$.ajax({
			url:'/soldier/startProcess',
			data:{"procType":procType,"applyId":soldierId,"request":request,"username":username},
			type:'POST',
			dataType:'json',
			success:function(data){
				if(data.msg == "success"){
					$.messager.alert('消息','创建成功！','info');
				}else{
					$.messager.alert('消息','创建失败！' + data.msg,'info');
				}
			}
		});
	}
	
	function complete(){
		var pass = $('#nextStep').combobox('getValue');
		var reason = $('#reason').textbox('getValue');
		
		$.ajax({
			url:'/soldier/comploteProcess',
			data:{"procType":procType,"username":username,"pass":pass,"reason":reason,"taskId":taskId},
			type:'POST',
			dataType:'json',
			success:function(data){
				if(data.msg == "success"){
					$('#spDialog').window("close");
					$.messager.alert('消息','审批成功！','info');
				}else{
					$.messager.alert('消息','审批失败！' + data.msg,'info');
				}
			}
		});
	}
	
	function queryClick(){
		var procType = $('#process').combobox('getValue');
		var soldierId = $('#soldierId').textbox('getValue');
		if(thisIsNull(procType)){
			$.messager.alert('我的消息','请填写具体流程！','info');
			return;
		}
		if(thisIsNull(soldierId)){
			$.messager.alert('我的消息','请填写申请人ID！','info');
			return;
		}
		$.ajax({
			url:'/soldier/startProcess',
			data:{"IDNumber":IDNumber,"sessionId":sessionId},
			type:'POST',
			dataType:'json',
			success:function(data){
				soldierId = data.soldierId;
				$('#name').textbox('setValue', data.name);
				$('#number').textbox('setValue', data.idNumber);
			}
		});
	}
	
	function thisIsNull(param){
		if(param == null || param == ""){
			return true;			
		}
		return false;
	}
	
	function getNowFormatDate(millisecond) {
	    var date = new Date(millisecond);
	    var seperator1 = "-";
	    var seperator2 = ":";
	    var month = date.getMonth() + 1;
	    var strDate = date.getDate();
	    if (month >= 1 && month <= 9) {
	        month = "0" + month;
	    }
	    if (strDate >= 0 && strDate <= 9) {
	        strDate = "0" + strDate;
	    }
	    var currentdate = date.getFullYear() + seperator1 + month + seperator1 + strDate
	            + " " + date.getHours() + seperator2 + date.getMinutes()
	            + seperator2 + date.getSeconds();
	    return currentdate;
	}

</script>
</head>
<body>

	<div id="win" class="easyui-window" title="流程业务"
		style="width: 1000px; height: 600px"
		data-options="iconCls:'icon-save',modal:true">
		<div class="easyui-layout" data-options="fit:true">
			<div data-options="region:'west',split:true" style="width: 230px">
				<div id="right">
					<input id="soldier" type="text" style="width:210px">
					<input id="name" type="text" style="width:210px">
					<input id="number" type="text" style="width:210px">
					<input id="soldierId" type="text" style="width:210px">
				</div>
				<div id="right">
					<input id="process" name="" value=""  style="width:210px">
					<input id="request" name="" value=""  style="width:210px">
				</div>
				<div id="right">
					<a id="start" class="easyui-linkbutton" data-options="iconCls:'icon-ok',width:70,height:30,onClick:startClick">开启</a>
				</div>
				<div id="right">
					<a id="query" class="easyui-linkbutton" data-options="iconCls:'icon-search',width:70,height:30,onClick:queryClick">查询</a>
				</div>
			</div>
			
			<div data-options="region:'center'">
				<table id="task"></table> 
			</div>
			
			<div id="spDialog">
				<input id="nextStep" name="" value=""  style="width:210px">
				<input id="reason" name="" value=""  style="width:210px">
				<a id="shenpi" class="easyui-linkbutton" data-options="iconCls:'icon-ok',width:70,height:30,onClick:complete">审批</a>
			</div>
			<div id="ckDialog">
				<div id="con"></div>
			</div>
			
		</div>
	</div>

</body>
</html>