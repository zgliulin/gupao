package com.liulin.study.designpatterns.e_proxymode.dynamicproxy.jdkproxy;


/**
 * Create by DbL on 2020/3/1
 */
public class Test {
    public static void main(String[] args) {
        JdkMeipo jdkMeipo = new JdkMeipo();
        IPerson zhansan = jdkMeipo.getInstance(new Zhangsan());
        zhansan.findLove();

        IPerson zhaoliu = jdkMeipo.getInstance(new ZhaoLiu());
        zhaoliu.findLove();
    }
}
