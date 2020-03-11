package com.liulin.study.designpatterns.i_compositemode.demo.transparent;

import com.sun.corba.se.impl.util.PackagePrefixChecker;
import com.sun.javaws.jnl.PackageDesc;

/**
 * Create by DbL on 2020/3/11
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("===============================透明的组合模式=============================");
        CourseComponet javaBase = new Course("java入门课程", 8200.00);
        CourseComponet ai = new Course("人工智能", 5000.00);
        CourseComponet packageCourse = new CoursePackage("java架构师课程",2);
        CourseComponet design = new Course("java设计模式",1500.00);
        CourseComponet source =  new Course("源码分析",1800.00);
        CourseComponet softskill =  new Course("软技能",3800.00);
        packageCourse.addChild(design);
        packageCourse.addChild(source);
        packageCourse.addChild(softskill);

        CourseComponet catalog = new CoursePackage("鼓泡课程目录",1);
        catalog.addChild(javaBase);
        catalog.addChild(ai);
        catalog.addChild(packageCourse);
        catalog.print();
    }
}
