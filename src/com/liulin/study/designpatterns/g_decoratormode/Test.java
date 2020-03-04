package com.liulin.study.designpatterns.g_decoratormode;

/**
 * Create by DbL on 2020/3/4
 */
public class Test {
    public static void main(String[] args) {
        Battercake battercake;
        battercake = new BaseBattercake();
        System.out.println(battercake.getMsg()+",总价："+battercake.getPrice());
        battercake = new EggDecorator(battercake);
        System.out.println(battercake.getMsg()+",总价："+battercake.getPrice());
        battercake = new SaugeDecorator(battercake);
        System.out.println(battercake.getMsg()+",总价："+battercake.getPrice());
    }
}
