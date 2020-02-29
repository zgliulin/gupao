package com.liulin.study.designpatterns.b_factorymode.abstractfactory;

/**
 * Create by DbL on 2020/2/29
 */
public abstract  class CourseFactory {
    public  void init(){
        System.out.println("初始化基础数据");
    }

    public  abstract  INote createNote();

    public  abstract  IVideo createVideo();
}
