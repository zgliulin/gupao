package com.liulin.homework.w2020.w03.w01;

import java.lang.reflect.Method;

/**
 * Create by DbL on 2020/3/1
 */
public class GpMeipo implements GpInvocationHandler {
    private IPerson target;
    public IPerson getInstance(IPerson target){
        this.target = target;
        Class<?> clazz = target.getClass();
       //return  new Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
        return (IPerson) GpProxy.newProxyInstance(new GpClassLoader(),clazz.getInterfaces(),this);
       //return null;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        berfore();
        Object result = method.invoke(this.target,args);
        after();
        return result;
    }

    public void after(){
        System.out.println("双方同意，开始交往");
    }
    public  void berfore(){
        System.out.println("我是媒婆，已经收集到你的需求，开始物色");
    }
}
