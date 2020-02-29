package com.liulin.study.designpatterns.b_factorymode.simplefactory;

/**
 * Create by DbL on 2020/2/29
 */
public class CourseFactory {
    public  ICouse create(Class<? extends ICouse> clazz){
        try {
            if(clazz != null) {
                return clazz.newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
