package com.test.spring;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainTest {
	public static void main(String[] args) {
		FileSystemXmlApplicationContext ac = new FileSystemXmlApplicationContext("springBeanContext.xml");
		TestSpring ts = ac.getBean(TestSpring.class);
		ts.firstTest();
		System.out.println("Testing Done");
		ac.close();
	}
}
