package com.liulin.study.designpatterns.sigletondemo;

/**
 * Create by DbL on 2020/2/26
 */

/**
 * 饿汉式单例  类加载时就创建
 */
public class HungreSingleton {
    private static final HungreSingleton HUNGRE_SINGLETON ;

    static {
        HUNGRE_SINGLETON = new HungreSingleton();
    }

    private HungreSingleton(){}

    public static HungreSingleton getInstance(){
        return HUNGRE_SINGLETON;
    }
}
