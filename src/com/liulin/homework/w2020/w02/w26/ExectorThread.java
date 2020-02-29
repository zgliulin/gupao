package com.liulin.homework.w2020.w02.w26;

/**
 * Create by DbL on 2020/2/26
 */
public class ExectorThread implements  Runnable{
    @Override
    public void run() {
        ContainerSingleton.getInstance("java.lang.Object");
    }
}
