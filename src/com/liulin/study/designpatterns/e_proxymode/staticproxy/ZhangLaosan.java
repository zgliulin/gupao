package com.liulin.study.designpatterns.e_proxymode.staticproxy;

/**
 * Create by DbL on 2020/3/1
 */
public class ZhangLaosan implements  IPerson {
    @Override
    public void findLove() {
        System.out.println("张老三开始物色");
        zhangsan.findLove();
        System.out.println("开始交往");
    }

    private Zhangsan zhangsan;

    public  ZhangLaosan(Zhangsan zhangsan){
        this.zhangsan = zhangsan;
    }
}
