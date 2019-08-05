package com.yucong.model;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class Test1 {


    public static void main(String[] args) {
        Animal animal = null;

        AnimalVO animalVO = JSONObject.parseObject(JSON.toJSONString(animal), AnimalVO.class);

        System.out.println(JSON.toJSONString(animalVO, SerializerFeature.PrettyFormat));
    }
}
