<%@ page language="java" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	String path = request.getContextPath();//springboot默认根路径是 '/'，可以在属性文件进行配置
	String base = request.getScheme() + "://"+ request.getServerName() + ":" + request.getServerPort()+ path + "/";
%>
<html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <base href="<%=base%>" />
    <script type="text/javascript" src="/easyui/jquery.min.js"></script>
</head>
<body style="background-color: #68D851">
	<div style="border: 2px solid red;margin: auto;width: 300px;padding: 10px">
		<span>这是JSP页面</span>
		<form action="" method="post">
			<p>username：<input type="text" id="username" /></p>
			<p>password：<input type="password" id="password"/></p>
			<p><input id="btn" type="button" value="登陆"></p>
		</form>
	</div>
	
	${sessionScope.user.username }:${sessionScope.user.password }
	
	
</body>
<script type="text/javascript">	
	$("#btn").click(function(){
		var data = {
			username:$("#username").val(),
			password:$("#password").val(),
		}
		$.ajax({
			url:'/soldier/login',
			data:data,
			type:'GET',
			dataType:'json',
			success:function(msg){
				console.log(msg);
			}
		});
	});
</script>
</html>