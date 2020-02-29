package com.liulin.study.designpatterns.a_sigletondemo;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Create by DbL on 2020/2/26
 */
public class ContainerSingleton {
    private  ContainerSingleton(){}
    private static Map<String ,Object> ioc = new ConcurrentHashMap<String,Object>();

    public static Object getInstance(String className){
        Object instance = null;
        if(!ioc.containsKey(className)){
            try {
                instance = Class.forName(className).newInstance();
                ioc.put(className,instance);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return instance;
        }else{
            return ioc.get(className);
        }
    }
}
