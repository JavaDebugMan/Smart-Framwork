package com.javaman.proxy;

/**
 * @author pengzhe
 * @date 2018/2/27 13:11
 * @description
 */

public class HelloImpl implements Hello {
    @Override
    public void sayHello(String name) {
        System.out.println("Hello" + name);
    }
}
