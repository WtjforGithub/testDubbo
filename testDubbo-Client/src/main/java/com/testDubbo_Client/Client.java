package com.testDubbo_Client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.testdubbo_service.SayHelloService;

public class Client {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("consumer.xml");
		SayHelloService sayHello = ac.getBean("sayHelloService",SayHelloService.class);
		sayHello.sayHello();
	}
}
