package com.liulin.study.designpatterns.factorymode.factorymethod;

/**
 * Create by DbL on 2020/2/29
 */
public class JavaCourseFactory implements  ICourseFactory {
    @Override
    public ICouse create() {
        return new JavaCouse();
    }
}
