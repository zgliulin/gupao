package com.liulin.study.designpatterns.sigletondemo;

/**
 * Create by DbL on 2020/2/26
 */

/**
 * 懒汉式单例  被外部类调用时才创建
 * 优点：节省内存
 * 缺点：线程不安全  加synchronized可以解决这个问题 随之带来的性能下降
 */
public class LazySimpleSingleton {
    private static LazySimpleSingleton lazySimpleSingleton;

    private LazySimpleSingleton(){}

    public synchronized static LazySimpleSingleton getInstance(){
        if(lazySimpleSingleton==null){
            lazySimpleSingleton = new LazySimpleSingleton();
        }
        return lazySimpleSingleton;
    }
}
