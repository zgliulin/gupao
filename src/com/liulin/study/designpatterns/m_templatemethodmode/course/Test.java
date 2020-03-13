package com.liulin.study.designpatterns.m_templatemethodmode.course;

/**
 * Create by DbL on 2020/3/13
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("===============架构师课程=================");
        JavaCourse  javaCourse = new JavaCourse();
        javaCourse.setNeedCheckHomework(false);
        javaCourse.createCourse();

        System.out.println("===============python课程=================");
        PythonCourse pythonCourse = new PythonCourse();
        pythonCourse.createCourse();
    }
}
