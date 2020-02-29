package com.liulin.study.designpatterns.sigletondemo;

/**
 * Create by DbL on 2020/2/26
 */

public enum EnumSingleton {
    INSTANCE;
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}
