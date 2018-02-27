package com.javaman.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author pengzhe
 * @date 2018/2/27 20:19
 * @description
 */

public class CGLibDynamicProxy implements MethodInterceptor {

    public <T> T getProxy(Class<T> clazz) {
        return (T) Enhancer.create(clazz, this);

    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
        Object result = methodProxy.invokeSuper(o, objects);
        after();
        return result;
    }

    private void before() {
        System.out.println("before");
    }

    private void after() {
        System.out.println("after");
    }
}
