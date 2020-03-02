package com.liulin.study.designpatterns.e_proxymode.dynamicproxy.jdkproxy;


/**
 * Create by DbL on 2020/3/1
 */
public class ZhaoLiu implements  IPerson {
    @Override
    public void findLove() {
        System.out.println("赵六要求：有车有房学历高");
    }

    @Override
    public void buyInsure() {
        System.out.println("30W");
    }

}
