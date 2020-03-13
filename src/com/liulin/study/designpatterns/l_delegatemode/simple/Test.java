package com.liulin.study.designpatterns.l_delegatemode.simple;

/**
 * Create by DbL on 2020/3/13
 */
public class Test {
    public static void main(String[] args) {
        new Boos().command("海报图",new Leader());
        new Boos().command("卖手机",new Leader());
    }
}
