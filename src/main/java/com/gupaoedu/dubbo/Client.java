package com.gupaoedu.dubbo;

import com.alibaba.dubbo.common.extension.ExtensionLoader;
import com.alibaba.dubbo.rpc.Protocol;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Client {
    public static void main(String[] args) throws IOException, InterruptedException {
//        ApplicationContext context = new ClassPathXmlApplicationContext("dubbo-client.xml");
//
//        //得到IGpHello的远程代理对象
//        IGpHello iGpHello = (IGpHello) context.getBean("gpHelloService");
//
//        System.out.println(iGpHello.sayHello("Mic"));
//        Thread.sleep(4000);
//
//        System.in.read();


        Protocol protocol = ExtensionLoader.getExtensionLoader(Protocol.class).getExtension("myProtocol");
        System.out.println(protocol.getDefaultPort());
    }
}
