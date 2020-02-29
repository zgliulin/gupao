package com.liulin.test.singleton.SingletonTest;

import com.liulin.study.designpatterns.sigletondemo.LazySimpleSingleton;

/**
 * Create by DbL on 2020/2/26
 */
public class ExectorThread  implements  Runnable{
    @Override
    public void run() {
        LazySimpleSingleton instance = LazySimpleSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+":"+instance);
    }
}
