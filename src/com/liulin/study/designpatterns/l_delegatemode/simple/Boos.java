package com.liulin.study.designpatterns.l_delegatemode.simple;

/**
 * Create by DbL on 2020/3/13
 */
public class Boos {
    public void command(String task,Leader leader){
        leader.doing(task);
    }
}
