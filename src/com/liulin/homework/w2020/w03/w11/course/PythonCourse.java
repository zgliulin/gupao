package com.liulin.homework.w2020.w03.w11.course;

/**
 * Create by DbL on 2020/3/13
 */
public class PythonCourse {

    private AbstractCourse course;

    public PythonCourse() {
        this.course = new AbstractCourse() {
            @Override
            protected void checkHomework() {
                System.out.println("检查python作业");
            }

            @Override
            protected boolean needCheckHomework() {
                return true;
            }
        };
    }

    public void cratePythonCourse(){
        this.course.createCourse();
    }


}
