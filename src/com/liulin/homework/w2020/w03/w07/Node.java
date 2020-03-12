package com.liulin.homework.w2020.w03.w07;

/**
 * Create by DbL on 2020/3/12
 */
public abstract class Node {
    protected String name;
    protected String xpath="";

    public Node(String name) {
        this.name = name;
    }

    public abstract void show();
}
