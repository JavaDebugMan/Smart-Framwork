package com.javaman.proxy;

/**
 * @author pengzhe
 * @date 2018/2/27 20:10
 * @description
 */

public class JdkDynamicProxyTest {

    public static void main(String[] args) {
       /* Hello hello = new HelloImpl();
        JdkDynamicProxy jdkDynamicProxy = new JdkDynamicProxy(hello);

        Hello helloProxy = (Hello) Proxy.newProxyInstance(hello.getClass().getClassLoader(),
                hello.getClass().getInterfaces(), jdkDynamicProxy);
        helloProxy.sayHello("zhege");*/
        JdkDynamicProxy jdkDynamicProxy = new JdkDynamicProxy(new HelloImpl());
        Hello proxy = jdkDynamicProxy.getProxy();
        proxy.sayHello("哲哥");
    }
}
