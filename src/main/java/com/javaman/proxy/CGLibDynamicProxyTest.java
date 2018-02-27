package com.javaman.proxy;

/**
 * @author pengzhe
 * @date 2018/2/27 20:25
 * @description
 */

public class CGLibDynamicProxyTest {
    public static void main(String[] args) {
        CGLibDynamicProxy cgLibDynamicProxy = new CGLibDynamicProxy();
        Hello helloProxy = cgLibDynamicProxy.getProxy(HelloImpl.class);
        helloProxy.sayHello("CGLib");
    }
}
