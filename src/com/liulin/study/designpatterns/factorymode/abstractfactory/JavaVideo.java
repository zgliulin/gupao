package com.liulin.study.designpatterns.factorymode.abstractfactory;

/**
 * Create by DbL on 2020/2/29
 */
public class JavaVideo implements  IVideo {
    @Override
    public void record() {
        System.out.println("录制JavaVdio");
    }
}
