package com.liulin.study.designpatterns.m_templatemethodmode.course;

/**
 * Create by DbL on 2020/3/13
 */
public class PythonCourse extends AbstractCourse {

    @Override
    protected void checkHomework() {
        System.out.println("检查python作业");
    }


}
