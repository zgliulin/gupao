package com.liulin.study.designpatterns.factorymode.abstractfactory;

/**
 * Create by DbL on 2020/2/29
 */
public class JavaCourseFactory extends CourseFactory {
    @Override
    public INote createNote() {
        super.init();
        return new JavaNote();
    }

    @Override
    public IVideo createVideo() {
        super.init();
        return new JavaVideo();
    }
}
