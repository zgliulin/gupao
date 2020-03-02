package com.liulin.study.designpatterns.e_proxymode.dynamicproxy.jdkproxy;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Create by DbL on 2020/3/1
 */
public class JdkMeipo implements InvocationHandler {
    private IPerson target;
    public IPerson getInstance(IPerson target){
        this.target = target;
        Class<?> clazz = target.getClass();
       //return  new Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
        return (IPerson) Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
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
        System.out.println("after");
    }
    public  void berfore(){
        System.out.println("before");
    }
}
