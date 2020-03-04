package com.liulin.study.designpatterns.g_decoratormode;

/**
 * Create by DbL on 2020/3/4
 */
public class BaseBattercake  extends Battercake{
    @Override
    protected String getMsg() {
        return "煎饼";
    }

    @Override
    public int getPrice() {
        return 5;
    }
}
