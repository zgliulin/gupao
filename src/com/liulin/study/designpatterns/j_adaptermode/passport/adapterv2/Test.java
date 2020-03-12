package com.liulin.study.designpatterns.j_adaptermode.passport.adapterv2;

/**
 * Create by DbL on 2020/3/12
 */
public class Test {
    public static void main(String[] args) {
        IPassportForThird adapter = new PassportForThirdAdapter();
        adapter.loginForQQ("sdfasdfasfasfas");
    }
}
