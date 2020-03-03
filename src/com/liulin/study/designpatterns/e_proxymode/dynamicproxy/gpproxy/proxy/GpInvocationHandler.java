package com.liulin.study.designpatterns.e_proxymode.dynamicproxy.gpproxy.proxy;

import java.lang.reflect.Method;

/**
 * Create by DbL on 2020/3/1
 */
public interface GpInvocationHandler {
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable ;
}
