package com.liulin.study.designpatterns.j_adaptermode.power.classadapter;

/**
 * Create by DbL on 2020/3/11
 */
public class PowerAdapter extends  AC220 implements DC5 {
    @Override
    public int output5V() {
        int adapterInput = super.outputAC220V();
        int adapterOutput = adapterInput/44;
        System.out.println("输入"+adapterInput+"V"+",输出"+adapterOutput+"V");
        return adapterOutput;
    }
}
