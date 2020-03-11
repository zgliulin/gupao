package com.liulin.study.designpatterns.i_compositemode.demo.safe;

/**
 * Create by DbL on 2020/3/11
 */
public abstract  class Directrory {
    protected  String name;
    public Directrory(String name){
        this.name = name;
    }
    public abstract  void show();
}
