package com.yucong.entity;

import java.io.Serializable;

import com.alibaba.fastjson.JSON;

public class BaseBean implements Serializable {

    private static final long serialVersionUID = -8579291406898392893L;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }

}
