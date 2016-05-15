package com.dubbo.demo.consumer;

import com.dubbo.demo.HelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author Jerry Lee
 */
public class ConsumerMain {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("application-context-consumer.xml");
//        classPathXmlApplicationContext.start();
//
//        HelloService helloService = (HelloService) classPathXmlApplicationContext.getBean("helloService");
//        String world = helloService.hello("World");
//
//        System.out.println("=====================================");
//        System.out.println(world);
//        System.out.println("=====================================");

        List<String> stringList = null;
        for(String str : stringList) {
            System.out.println(str);
        }
    }
}
