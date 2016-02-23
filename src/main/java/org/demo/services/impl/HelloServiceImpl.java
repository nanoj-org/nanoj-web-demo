package org.demo.services.impl;

import javax.inject.Singleton;

import org.demo.services.HelloService;

@Singleton
public class HelloServiceImpl implements HelloService {

	@Override
	public String hello(String s) {
		System.out.println("HelloServiceImpl : hello('"+ s + "')");
		return "Hello " + s ;
	}

}
