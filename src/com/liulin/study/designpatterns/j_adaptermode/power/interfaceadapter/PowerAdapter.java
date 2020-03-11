package com.liulin.study.designpatterns.j_adaptermode.power.interfaceadapter;


/**
 * Create by DbL on 2020/3/11
 */
public class PowerAdapter  implements DC {

    private AC220 ac220;

    public PowerAdapter(AC220 ac220) {
        this.ac220 = ac220;
    }

    @Override
    public int output5V() {
        int adapterInput = ac220.outputAC220V();
        int adapterOutput = adapterInput/44;
        System.out.println("输入"+adapterInput+"V"+",输出"+adapterOutput+"V");
        return adapterOutput;
    }

    @Override
    public int output10V() {
        int adapterInput = ac220.outputAC220V();
        int adapterOutput = adapterInput/22;
        System.out.println("输入"+adapterInput+"V"+",输出"+adapterOutput+"V");
        return adapterOutput;
    }

    @Override
    public int output24V() {
        int adapterInput = ac220.outputAC220V();
        int adapterOutput = adapterInput/(220/24);
        System.out.println("输入"+adapterInput+"V"+",输出"+adapterOutput+"V");
        return adapterOutput;
    }

    @Override
    public int output36V() {
        int adapterInput = ac220.outputAC220V();
        int adapterOutput = adapterInput/(220/36);
        System.out.println("输入"+adapterInput+"V"+",输出"+adapterOutput+"V");
        return adapterOutput;
    }
}
