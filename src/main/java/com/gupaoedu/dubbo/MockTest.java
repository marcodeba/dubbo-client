package com.gupaoedu.dubbo;

public class MockTest implements IGpHello {

    @Override
    public String sayHello(String msg) {
        return "系统繁忙 " + msg;
    }
}
