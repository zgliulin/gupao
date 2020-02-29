package com.liulin.study.designpatterns.sigletondemo;

/**
 * Create by DbL on 2020/2/26
 */

/**
 * 优点：执行效率高，性能高，没有任何的锁
 * 缺点：某些情况下，可能会造成内存浪费
 */
public class HungreStaticSingleton {
    private static final HungreStaticSingleton HUNGRE_SINGLETON = new HungreStaticSingleton();

    private HungreStaticSingleton(){}

    public static HungreStaticSingleton getInstance(){
        return HUNGRE_SINGLETON;
    }
}
