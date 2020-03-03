package com.liulin.homework.w2020.w03.w01;

import java.lang.reflect.Method;

/**
 * Create by DbL on 2020/3/1
 */
public interface GpInvocationHandler {
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable ;
}
