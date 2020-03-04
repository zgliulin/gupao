package com.liulin.study.designpatterns.g_decoratormode;

/**
 * Create by DbL on 2020/3/4
 */
public class EggDecorator extends Battercake {
    private Battercake battercake;

    public EggDecorator(Battercake battercake) {
        this.battercake = battercake;
    }

    @Override
    protected String getMsg() {
        return this.battercake.getMsg()+"+1个鸡蛋";
    }

    @Override
    public int getPrice() {
        return this.battercake.getPrice()+1;
    }
}
