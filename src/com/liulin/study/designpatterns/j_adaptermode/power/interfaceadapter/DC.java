package com.liulin.study.designpatterns.j_adaptermode.power.interfaceadapter;

/**
 * Create by DbL on 2020/3/11
 */
public interface DC {
    int output5V();
    int output10V();
    int output24V();
    int output36V();
}
