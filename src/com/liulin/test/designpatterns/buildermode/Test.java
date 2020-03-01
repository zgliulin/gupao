package com.liulin.test.designpatterns.buildermode;

import com.liulin.study.designpatterns.d_buildermode.Course;

/**
 * Create by DbL on 2020/3/1
 */
public class Test {
    public static void main(String[] args) {
        Course course = new Course().setName("name").setNote("note").setPpt("ppt").setVideo("video");
    }
}
