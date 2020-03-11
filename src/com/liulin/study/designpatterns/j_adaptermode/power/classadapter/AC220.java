package com.liulin.study.designpatterns.j_adaptermode.power.classadapter;

/**
 * Create by DbL on 2020/3/11
 */
public class AC220 {
    public int outputAC220V(){
        int output = 220;
        System.out.println("输出电压"+output+"V");
        return output;
    }
}
