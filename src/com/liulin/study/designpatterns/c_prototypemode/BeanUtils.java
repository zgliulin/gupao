package com.liulin.study.designpatterns.c_prototypemode;


import jdk.nashorn.internal.runtime.PrototypeObject;

import java.lang.reflect.Field;

/**
 * Create by DbL on 2020/3/1
 */
public class BeanUtils {
    public static Object copy(Object grotorype){
        Class clazz = grotorype.getClass();
        Object returnValue = null;
        try {
            returnValue = clazz.newInstance();
            for (Field field : clazz.getDeclaredFields()) {
                field.setAccessible(true);
                field.set(returnValue,field.get(grotorype));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return returnValue;
    }
}
