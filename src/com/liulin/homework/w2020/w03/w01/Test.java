package com.liulin.homework.w2020.w03.w01;


/**
 * Create by DbL on 2020/3/1
 */
public class Test {
    public static void main(String[] args) {
        GpMeipo gpMeipo = new GpMeipo();
        IPerson zhansan = gpMeipo.getInstance(new Zhangsan());
        zhansan.findLove();
        zhansan.buyInsure(500000);
    }
}
