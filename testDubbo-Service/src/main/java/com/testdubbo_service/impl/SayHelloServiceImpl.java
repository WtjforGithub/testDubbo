package com.testdubbo_service.impl;

import com.testdubbo_service.SayHelloService;

public class SayHelloServiceImpl implements SayHelloService {

	@Override
	public void sayHello() {
		System.out.println("hello dubbo");
	}

}
