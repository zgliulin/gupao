package com.liulin.homework.w2020.w02.w26;

/**
 * Create by DbL on 2020/2/29
 */
public class Test {

    public static void main(String[] args) {
        for (int i=0;i<100;i++) {
            Thread t = new Thread(new ExectorThread());
            t.start();
        }



    }

}
