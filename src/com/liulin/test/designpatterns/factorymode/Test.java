package com.liulin.test.designpatterns.factorymode;

import com.liulin.study.designpatterns.factorymode.factorymethod.ICourseFactory;
import com.liulin.study.designpatterns.factorymode.factorymethod.ICouse;
import com.liulin.study.designpatterns.factorymode.factorymethod.PythonCourseFactory;
import com.liulin.study.designpatterns.factorymode.simplefactory.CourseFactory;
import com.liulin.study.designpatterns.factorymode.simplefactory.JavaCouse;

/**
 * Create by DbL on 2020/2/29
 */
public class Test {
    public static void main(String[] args) {
        // Couse couse = new Couse();
        // ICouse couse = new JavaCouse();
        // ICouse couse = new CourseFactory().create(JavaCouse.class);
        // couse.record();
        ICourseFactory factory = new PythonCourseFactory();
        ICouse iCouse = factory.create();
        iCouse.record();
    }
}
