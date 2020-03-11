package com.liulin.study.designpatterns.h_flyweightmode.jdk;

/**
 * Create by DbL on 2020/3/10
 */
public class IntegerTest {
    public static void main(String[] args) {
        Integer a = Integer.valueOf(100);
        Integer b = 100;
        Integer c = Integer.valueOf(1000);
        Integer d = 1000;
        System.out.println(a == b); //true
        System.out.println(c == d);//false
    }
}
