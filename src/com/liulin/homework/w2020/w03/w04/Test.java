package com.liulin.homework.w2020.w03.w04;

/**
 * Create by DbL on 2020/3/4
 */
public class Test {
    public static void main(String[] args) {
        GupaoMenu gupaoMenu;
        gupaoMenu = new BaseGupaoMenu();
        gupaoMenu = new VipGupaoMenuDecorator(gupaoMenu);
        System.out.println("VIP的咕泡的菜单有："+gupaoMenu.getMenu());
    }
}
