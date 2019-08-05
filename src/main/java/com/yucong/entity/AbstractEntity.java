package com.yucong.entity;

import org.apache.commons.lang3.builder.ToStringBuilder;

public abstract class AbstractEntity extends BaseBean {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}