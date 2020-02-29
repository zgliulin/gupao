package com.liulin.test.singleton.SingletonTest;

import com.liulin.study.designpatterns.sigletondemo.EnumSingleton;

import java.lang.reflect.Constructor;

/**
 * Create by DbL on 2020/2/26
 */
public class EnumSingletonTest {
    public static void main(String[] args) {
        EnumSingleton instance = EnumSingleton.getInstance();
        try {
            Class clazz = EnumSingleton.class;
            Constructor c = clazz.getDeclaredConstructor(null);
            c.setAccessible(true);
            Object o = c.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
