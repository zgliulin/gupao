package com.liulin.study.designpatterns.g_decoratormode;

/**
 * Create by DbL on 2020/3/4
 */
public class SaugeDecorator extends Battercake {
    private Battercake battercake;

    public SaugeDecorator(Battercake battercake) {
        this.battercake = battercake;
    }

    @Override
    protected String getMsg() {
        return this.battercake.getMsg()+"+1个香肠";
    }

    @Override
    public int getPrice() {
        return this.battercake.getPrice()+2;
    }
}
