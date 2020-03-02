package com.liulin.study.designpatterns.e_proxymode.dynamicproxy.cglibgroxy;
import com.liulin.study.designpatterns.e_proxymode.dynamicproxy.jdkproxy.IPerson;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Create by DbL on 2020/3/1
 */
public class CglibMeipo implements MethodInterceptor {
    public Object getInstance(Class<?> clazz){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }
    private void before(){
        System.out.println("我是媒婆，已经收集到你的需求，开始物色");
    }

    private void after(){
        System.out.println("双方同意，开始交往");
    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
        Object result = methodProxy.invokeSuper(o, objects);
        after();
        return result;
    }
}
