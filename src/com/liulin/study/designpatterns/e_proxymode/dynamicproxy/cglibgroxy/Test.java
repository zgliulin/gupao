package com.liulin.study.designpatterns.e_proxymode.dynamicproxy.cglibgroxy;

/**
 * Create by DbL on 2020/3/2
 */
public class Test {
    public static void main(String[] args) {
        Zhangsan zhangsan = (Zhangsan) new CglibMeipo().getInstance(Zhangsan.class);
        zhangsan.findLove();
    }
}
