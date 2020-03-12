package com.liulin.homework.w2020.w03.w08;

/**
 * Create by DbL on 2020/3/12
 */
public interface ILoginAdapter {
    boolean support(Object object);
    ResultMsg login(String id, Object adapter);
}
