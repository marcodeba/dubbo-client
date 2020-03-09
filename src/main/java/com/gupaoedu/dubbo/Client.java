package com.gupaoedu.dubbo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Client {
    public static void main(String[] args) throws IOException {
        ApplicationContext context = new ClassPathXmlApplicationContext("dubbo-client.xml");
        //得到IGpHello的远程代理对象
        IGpHello iGpHello = (IGpHello) context.getBean("gpHelloService");
        System.out.println(iGpHello.sayHello("Mic"));
        System.in.read();
    }
}
