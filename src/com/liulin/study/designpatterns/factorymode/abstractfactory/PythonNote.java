package com.liulin.study.designpatterns.factorymode.abstractfactory;

/**
 * Create by DbL on 2020/2/29
 */
public class PythonNote implements  INote {

    @Override
    public void edit() {
        System.out.println("edit python note");
    }
}
