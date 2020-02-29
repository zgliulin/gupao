package com.liulin.study.designpatterns.factorymode.abstractfactory;

/**
 * Create by DbL on 2020/2/29
 */
public class PythonCourseFactory extends CourseFactory {
    @Override
    public INote createNote() {
        super.init();
        return new PythonNote();
    }

    @Override
    public IVideo createVideo() {
        super.init();
        return new PythonVideo();
    }
}
