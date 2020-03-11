package com.liulin.study.designpatterns.j_adaptermode.power.objectAdapter;

/**
 * Create by DbL on 2020/3/11
 */
public class Test {
    public static void main(String[] args) {
        DC5 adapter = new PowerAdapter(new AC220());
        adapter.output5V();
    }
}
