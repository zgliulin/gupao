package com.liulin.test.singleton.SingletonTest;

import com.liulin.study.designpatterns.sigletondemo.LazyStaticInnerClassSingleton;

import java.lang.reflect.Constructor;

/**
 * Create by DbL on 2020/2/26
 */
public class ReflectTest {
    // 测试反射破坏LazyStaticInnerClassSingleton
    public static void main(String[] args) {
        try {
            Class<?> clazz = LazyStaticInnerClassSingleton.class;
            Constructor c =  clazz.getDeclaredConstructor(null);
            c.setAccessible(true);
            Object instance1 = c.newInstance();
            Object instance2 = c.newInstance();
            System.out.println(instance1);
            System.out.println(instance2);
            System.out.println(instance1==instance2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
