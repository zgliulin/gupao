package com.liulin.study.designpatterns.factorymode.abstractfactory;

/**
 * Create by DbL on 2020/2/29
 */
public class PythonVideo implements  IVideo {
    @Override
    public void record() {
        System.out.println("录制PythonVdio");
    }
}
