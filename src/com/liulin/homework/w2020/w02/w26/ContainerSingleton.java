package com.liulin.homework.w2020.w02.w26;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Create by DbL on 2020/2/29
 */
public class ContainerSingleton {
    private ContainerSingleton(){}
    private static Map<String ,Object> ioc = new ConcurrentHashMap<String,Object>();

    public static Object getInstance(String className){
        Object instance = null;
        if(!ioc.containsKey(className)){
            try {
                synchronized (ContainerSingleton.class){
                    if(!ioc.containsKey(className)){
                        instance = Class.forName(className).newInstance();
                        ioc.put(className,instance);
                    }
                }
                // ioc.put(className,instance);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(ioc.get(className));
            return instance;
        }else{
            System.out.println(ioc.get(className));
            return ioc.get(className);
        }
    }
}
