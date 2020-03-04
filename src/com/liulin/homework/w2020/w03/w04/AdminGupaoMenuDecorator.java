package com.liulin.homework.w2020.w03.w04;

/**
 * Create by DbL on 2020/3/4
 */
public class AdminGupaoMenuDecorator extends GupaoMenu {
    private GupaoMenu gupaoMenu;

    public AdminGupaoMenuDecorator(GupaoMenu gupaoMenu) {
        this.gupaoMenu = gupaoMenu;
    }

    @Override
    protected String getMenu() {
        return this.gupaoMenu.getMenu()+"、用户管理、权限管理";
    }
}
