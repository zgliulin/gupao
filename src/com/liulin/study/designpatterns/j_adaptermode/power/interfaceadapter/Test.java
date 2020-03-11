package com.liulin.study.designpatterns.j_adaptermode.power.interfaceadapter;


/**
 * Create by DbL on 2020/3/11
 */
public class Test {
    public static void main(String[] args) {
        DC adapter = new PowerAdapter(new AC220());
        adapter.output5V();
        adapter.output10V();
    }
}
