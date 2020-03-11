package com.liulin.study.designpatterns.i_compositemode.demo.safe;

/**
 * Create by DbL on 2020/3/11
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("=====================安全模式写法=====================");
        File qq = new File("QQ.exe");
        File wx = new File("微信.exe");

        Folder office = new Folder("办公软件", 2);

        File word = new File("word.exe");
        File exce = new File("excel.exe");
        File pdf = new File("pdf.exe");
        File pp = new File("powerpoint.exe");

        office.add(word);
        office.add(exce);
        office.add(pdf);
        office.add(pp);

        Folder root = new Folder("D盘",1);
        root.add(office);
        root.add(wx);
        root.add(qq);

        root.show();
        root.list();
    }
}
