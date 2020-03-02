package com.liulin.study.designpatterns.e_proxymode.staticproxy;

/**
 * Create by DbL on 2020/3/1
 */
public class Test {
    public static void main(String[] args) {
        ZhangLaosan zhangLaosan = new ZhangLaosan(new Zhangsan());
        zhangLaosan.findLove();
    }
}
