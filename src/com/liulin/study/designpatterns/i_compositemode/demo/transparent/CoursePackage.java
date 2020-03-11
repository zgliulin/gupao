package com.liulin.study.designpatterns.i_compositemode.demo.transparent;

import java.util.ArrayList;
import java.util.List;

/**
 * Create by DbL on 2020/3/11
 */
public class CoursePackage extends CourseComponet {
    private List<CourseComponet> items = new ArrayList<CourseComponet>();
    private String name;
    private Integer level;

    public CoursePackage(String name, Integer level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void addChild(CourseComponet courseComponet) {
        items.add(courseComponet);
    }

    @Override
    public void removeChild(CourseComponet courseComponet) {
        items.remove(courseComponet);
    }

    @Override
    public String getName(CourseComponet courseComponet) {
        return this.name;
    }


    @Override
    public void print() {
        System.out.println(this.name);
        for (CourseComponet c : items) {
            if (this.level != null) {
                for (int i = 0; i < this.level; i++) {
                    System.out.print("     ");
                }
                for (int i = 0; i < this.level; i++) {
                    if (i == 0) {
                        System.out.print("+");
                    }
                    System.out.print("-");

                }
                c.print();
            }

        }
    }
}
