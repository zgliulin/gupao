package com.liulin.study.designpatterns.i_compositemode.demo.safe;

/**
 * Create by DbL on 2020/3/11
 */
public class File  extends  Directrory{
    public File(String name) {
        super(name);
    }

    @Override
    public void show() {
        System.out.println(this.name);
    }
}
