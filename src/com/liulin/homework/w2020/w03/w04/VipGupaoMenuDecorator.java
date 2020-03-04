package com.liulin.homework.w2020.w03.w04;

/**
 * Create by DbL on 2020/3/4
 */
public class VipGupaoMenuDecorator extends GupaoMenu {
    private GupaoMenu gupaoMenu;

    public VipGupaoMenuDecorator(GupaoMenu gupaoMenu) {
        this.gupaoMenu = gupaoMenu;
    }

    @Override
    protected String getMenu() {
        return this.gupaoMenu.getMenu()+"、作业、题库、成长墙";
    }
}
