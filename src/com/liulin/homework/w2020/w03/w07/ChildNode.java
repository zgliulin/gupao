package com.liulin.homework.w2020.w03.w07;

/**
 * Create by DbL on 2020/3/12
 */
public class ChildNode extends Node {
    public ChildNode(String name) {
        super(name);
    }

    @Override
    public void show() {
        System.out.println(this.xpath);
    }
}
