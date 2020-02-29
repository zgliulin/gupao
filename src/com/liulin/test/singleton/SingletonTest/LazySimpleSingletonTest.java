package com.liulin.test.singleton.SingletonTest;

/**
 * Create by DbL on 2020/2/26
 */
public class LazySimpleSingletonTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ExectorThread());
        Thread t2 = new Thread(new ExectorThread());

        t1.start();
        t2.start();
        System.out.println("end");
    }
}
