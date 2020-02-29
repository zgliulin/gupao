package com.liulin.test.designpatterns.factorymode;

import com.liulin.study.designpatterns.b_factorymode.abstractfactory.CourseFactory;
import com.liulin.study.designpatterns.b_factorymode.abstractfactory.JavaCourseFactory;

/**
 * Create by DbL on 2020/2/29
 */
public class AbstractTest {
    public static void main(String[] args) {
        CourseFactory c = new JavaCourseFactory();
        c.createNote().edit();
        c.createVideo().record();
    }
}
