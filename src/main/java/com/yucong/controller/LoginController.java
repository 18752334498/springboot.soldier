package com.yucong.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.ImmutableMap;

@Controller
@RequestMapping("soldier")
public class LoginController {

    private static Map<String, Object> map = new HashMap<>();

    @RequestMapping(value = "index", method = RequestMethod.GET)
    public String index() {
        return "login";
    }

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String login(HttpServletRequest request, Model model) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        Object obj = map.get(username);
        if (obj == null){
            Map<String, Object> param = new HashMap<>();
            param.put("loginName", username);
            param.put("password", password);

            JSONObject response = post(param, "http://192.168.100.69:91/compcag/SOLIDER_01", null);
            if (!"000000".equals(response.getString("response_code"))) {
                System.out.println(response.toJSONString());
                return "error";
            }
            
            JSONObject object = response.getJSONObject("response_data");
            String sessionId = object.getString("sessionId");
            map.put(username, object.getString("sessionId"));
            System.out.println(sessionId);

            JSONObject currentUser = object.getJSONObject("currentUser");
            map.put(password, currentUser);
        }
        request.getSession().setAttribute("user", JSON.toJSONString(map));
        return "task";
    }

    @ResponseBody
    @RequestMapping(value = "dropDown", method = RequestMethod.POST)
    public String dropDown(HttpServletRequest request) {
        List<Map<String, Object>> list = new ArrayList<>();
        Map<String, Object> map1 = new HashMap<>();
        map1.put("label", "政策咨询");
        map1.put("value", "policy");
        list.add(map1);
        Map<String, Object> map2 = new HashMap<>();
        map2.put("label", "困难帮扶");
        map2.put("value", "help");
        list.add(map2);

        return JSON.toJSONString(list);
    }

    @ResponseBody
    @RequestMapping(value = "findSoldier", method = RequestMethod.POST)
    public String findSoldier(HttpServletRequest request) {
        String IDNumber = request.getParameter("IDNumber");
        String username = request.getParameter("username");

        ImmutableMap<String, Object> param = ImmutableMap.of("IDNumber", IDNumber);
        JSONObject response = post(param, "http://192.168.100.69:91/compcag/SOLIDER_18", map.get(username).toString());

        if (!"000000".equals(response.getString("response_code"))) {
            System.out.println(response.toJSONString());
            return JSON.toJSONString(ImmutableMap.of("msg", "fail"));
        }

        return response.getJSONObject("response_data").getString("soldier");
    }

    @ResponseBody
    @RequestMapping(value = "startProcess", method = RequestMethod.POST)
    public String startProcess(HttpServletRequest request) {
        String username = request.getParameter("username");
        String procType = request.getParameter("procType");
        String applyId = request.getParameter("applyId");
        String req = request.getParameter("request");

        ImmutableMap<String, Object> param = ImmutableMap.of("procType", procType, "applyId", applyId, "reason", req);
        JSONObject response = post(param, "http://192.168.100.69:91/compcag/SOLIDER_50", map.get(username).toString());

        if (!"000000".equals(response.getString("response_code"))) {
            System.out.println(response.toJSONString());
            return JSON.toJSONString(ImmutableMap.of("msg", response.getString("response_code_desc")));
        }
        return JSON.toJSONString(ImmutableMap.of("msg", "success"));
    }

    @ResponseBody
    @RequestMapping(value = "findProcessByRole", method = RequestMethod.POST)
    public String findProcessByRole(HttpServletRequest request) {
        String username = request.getParameter("username");
        String procType = request.getParameter("procType");
        String page = request.getParameter("page");
        String rows = request.getParameter("rows");

        ImmutableMap<String, Object> param = ImmutableMap.of("procType", procType, "pageIndex", page, "pageSize", rows);
        JSONObject response = post(param, "http://192.168.100.69:91/compcag/SOLIDER_52", map.get(username).toString());

        if (!"000000".equals(response.getString("response_code"))) {
            System.out.println(response.toJSONString());
            return JSON.toJSONString(ImmutableMap.of("msg", response.getString("response_code_desc")));
        }

        List<?> list = response.getJSONObject("response_data").getObject("data", List.class);
        String total = response.getJSONObject("response_data").getString("total");
        return JSON.toJSONString(ImmutableMap.of("rows", list, "total", total));
    }

    @ResponseBody
    @RequestMapping(value = "comploteProcess", method = RequestMethod.POST)
    public String comploteProcess(HttpServletRequest request) {
        String username = request.getParameter("username");
        String procType = request.getParameter("procType");
        String taskId = request.getParameter("taskId");
        String reason = request.getParameter("reason");
        String pass = request.getParameter("pass");

        ImmutableMap<String, Object> param = ImmutableMap.of("procType", procType, "taskId", taskId, "reason", reason, "pass", pass);
        JSONObject response = post(param, "http://192.168.100.69:91/compcag/SOLIDER_51", map.get(username).toString());

        if (!"000000".equals(response.getString("response_code"))) {
            System.out.println(response.toJSONString());
            return JSON.toJSONString(ImmutableMap.of("msg", response.getString("response_code_desc")));
        }

        return JSON.toJSONString(ImmutableMap.of("msg", "success"));
    }

    @ResponseBody
    @RequestMapping(value = "nextStep", method = RequestMethod.POST)
    public String nextStep(HttpServletRequest request) {
        String username = request.getParameter("username");
        String taskId = request.getParameter("taskId");

        ImmutableMap<String, Object> param = ImmutableMap.of("taskId", taskId);
        JSONObject response = post(param, "http://192.168.100.69:91/compcag/SOLIDER_49", map.get(username).toString());

        if (!"000000".equals(response.getString("response_code"))) {
            System.out.println(response.toJSONString());
            return JSON.toJSONString(ImmutableMap.of("msg", response.getString("response_code_desc")));
        }

        List<Map<String, Object>> list = new ArrayList<>();
        JSONObject object = response.getJSONObject("response_data");
        for (Entry<String, Object> entry : object.entrySet()) {
            Map<String, Object> map = new HashMap<>();
            map.put("label", entry.getKey());
            map.put("value", entry.getValue());
            list.add(map);
        }
        return JSON.toJSONString(list);
    }


    @ResponseBody
    @RequestMapping(value = "processDetail", method = RequestMethod.POST)
    public String processDetail(HttpServletRequest request) {
        String username = request.getParameter("username");
        String procInstId = request.getParameter("procInstId");

        ImmutableMap<String, Object> param = ImmutableMap.of("procInstId", procInstId);
        JSONObject response = post(param, "http://192.168.100.69:91/compcag/SOLIDER_56", map.get(username).toString());

        if (!"000000".equals(response.getString("response_code"))) {
            System.out.println(response.toJSONString());
            return JSON.toJSONString(ImmutableMap.of("msg", response.getString("response_code_desc")));
        }

        return response.getString("response_data");
    }


    // post请求，application/json格式，new HttpEntity的第一个参数只能是HashMap||JSONObject，不能是MultiValueMap
    private static JSONObject post(Map<String, Object> param, String url, String sessionId) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        if (StringUtils.isNotEmpty(sessionId)) {
            headers.set("sessionId", sessionId);
        }

        Map<String, Object> map = new HashMap<>();
        map.put("msg", JSON.toJSONString(param));

        // HttpEntity<MultiValueMap<String, Object>> httpEntity = new
        // HttpEntity<>(parameters,headers); //fail
        // HttpEntity<JSONObject> httpEntity = new HttpEntity<>(json, headers); //success
        HttpEntity<Map<String, Object>> httpEntity = new HttpEntity<>(map, headers); // success

        JSONObject object = restTemplate.postForObject(url, httpEntity, JSONObject.class);

        return object;
    }
}
