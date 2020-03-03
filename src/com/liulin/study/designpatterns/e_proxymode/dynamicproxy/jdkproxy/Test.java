package com.liulin.study.designpatterns.e_proxymode.dynamicproxy.jdkproxy;


import sun.misc.ProxyGenerator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Create by DbL on 2020/3/1
 */
public class Test {
    public static void main(String[] args) {
        JdkMeipo jdkMeipo = new JdkMeipo();
        IPerson zhansan = jdkMeipo.getInstance(new Zhangsan());
        zhansan.findLove();

        byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{IPerson.class});
        try {
            FileOutputStream os = new FileOutputStream("H://$Proxy0.class");
            os.write(bytes);
            os.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        /*IPerson zhaoliu = jdkMeipo.getInstance(new ZhaoLiu());
        zhaoliu.findLove();*/
    }
}
