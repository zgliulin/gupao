package com.liulin.study.designpatterns.j_adaptermode.power.objectAdapter;

/**
 * Create by DbL on 2020/3/11
 */
public class PowerAdapter  implements DC5 {
    private AC220 adaptee;

    public PowerAdapter(AC220 adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public int output5V() {
        int adapterInput = adaptee.outputAC220V();
        int adapterOutput = adapterInput/44;
        System.out.println("输入"+adapterInput+"V"+",输出"+adapterOutput+"V");
        return adapterOutput;
    }
}
