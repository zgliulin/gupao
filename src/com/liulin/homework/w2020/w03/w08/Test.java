package com.liulin.homework.w2020.w03.w08;

/**
 * Create by DbL on 2020/3/12
 */
public class Test {
    public static void main(String[] args) {
        OtherLoginAdatperDecorator adapter = new OtherLoginAdatperDecorator(new PassportForThirdAdapter());
        adapter.loginDouyin("aasdhfklassjhdd");
    }
}
