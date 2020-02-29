package com.liulin.study.designpatterns.sigletondemo;

/**
 * Create by DbL on 2020/2/26
 */
public class ThreadLocalSington {
    private static final ThreadLocal<ThreadLocalSington> instance =
            new ThreadLocal<ThreadLocalSington>(){
                @Override
                protected ThreadLocalSington initialValue() {
                    return new ThreadLocalSington();
                }
            };
    private ThreadLocalSington(){}

    public static ThreadLocalSington getInstance(){
        return instance.get();
    }


}
