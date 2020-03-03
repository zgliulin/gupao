package com.liulin.study.designpatterns.e_proxymode.dynamicproxy.gpproxy.client;


/**
 * Create by DbL on 2020/3/1
 */
public class Test {
    public static void main(String[] args) {
        GpMeipo gpMeipo = new GpMeipo();
        IPerson zhansan = gpMeipo.getInstance(new Zhangsan());
        zhansan.findLove();
    }
}
