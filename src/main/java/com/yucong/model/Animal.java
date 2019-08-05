package com.yucong.model;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.util.CollectionUtils;

import com.alibaba.fastjson.JSONArray;
import com.google.common.collect.Lists;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Animal {

    private Dog dog;

    private Cat cat;

    private List<Cat> cats;

    public List<Cat> getCats() {
        if (CollectionUtils.isEmpty(cats)) {
            return Lists.newArrayList(new Cat("", ""));
        }
        return cats;
    }



    @SuppressWarnings("unchecked")
    public void setCats(Object cats) {
        if (cats == null) {
            System.out.println("==============1");
            return;
        }
        if (cats instanceof String) {
            System.out.println("==============2");
            if (StringUtils.isEmpty(cats.toString())) {
                return;
            }
            List<Cat> list = JSONArray.parseArray(cats.toString(), Cat.class);
            this.cats = list;
        }
        if (cats instanceof List) {
            System.out.println("==============3");
            this.cats = (List<Cat>) cats;
        }
    }
}
