package com.liulin.homework.w2020.w02.w26;

import com.liulin.study.designpatterns.sigletondemo.LazySimpleSingleton;

/**
 * Create by DbL on 2020/2/26
 */
public class ExectorThread implements  Runnable{
    @Override
    public void run() {
        ContainerSingleton.getInstance("java.lang.Object");
    }
}
