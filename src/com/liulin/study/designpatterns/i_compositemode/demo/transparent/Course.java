package com.liulin.study.designpatterns.i_compositemode.demo.transparent;

/**
 * Create by DbL on 2020/3/11
 */
public class Course extends  CourseComponet {
    private String name;
    private Double price;

    public Course(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName(CourseComponet courseComponet) {
        return this.name;
    }

    @Override
    public Double getPrice(CourseComponet courseComponet) {
        return this.price;
    }

    @Override
    public void print() {
        System.out.println(name+":"+price);
    }
}
