package com.yucong.model;

import java.util.ArrayList;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class TestJson {

    public static void main(String[] args) {
        Dog dog = new Dog("zhangsan", "22");
        Cat cat = new Cat("lisi", "33");

        Animal animal = new Animal(dog, cat, new ArrayList<Cat>());
        System.out.println(JSON.toJSONString(animal, SerializerFeature.PrettyFormat));


        AnimalVO animalVO = JSONObject.parseObject(JSON.toJSONString(animal), AnimalVO.class);

        CatVO catVO = animalVO.getCat();
        System.out.println(catVO);

        System.out.println(JSON.toJSONString(animalVO, SerializerFeature.PrettyFormat));
    }

}
