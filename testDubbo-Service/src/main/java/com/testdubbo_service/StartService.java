package com.testdubbo_service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.dubbo.container.Main;

public class StartService {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("provider.xml");
		Main.main(args);
	}

}
