package com.liulin.study.designpatterns.e_proxymode.staticproxy;

import com.liulin.study.designpatterns.c_prototypemode.Iprototype;

/**
 * Create by DbL on 2020/3/1
 */
public class Zhangsan  implements IPerson {
    @Override
    public void findLove() {
        System.out.println("儿子要求：肤白貌美大长腿");
    }
}
