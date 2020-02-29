package com.liulin.study.designpatterns.sigletondemo;

/**
 * Create by DbL on 2020/2/26
 */

/**
 * 优点：写法优雅  利用了Java本身的语法特点，性能高，避免了内存浪费
 * 缺点：能够被反射破坏
 */
public class LazyStaticInnerClassSingleton {

    private LazyStaticInnerClassSingleton(){
        // 防止反射破坏
        if(LazyHolder.INSTANCE !=null ){
            throw new RuntimeException("不允许非法访问");
        }
    }

    private static LazyStaticInnerClassSingleton getInstance(){
        return LazyHolder.INSTANCE;
    }

    private static class LazyHolder{
        private static final LazyStaticInnerClassSingleton INSTANCE = new LazyStaticInnerClassSingleton();
    }
}
