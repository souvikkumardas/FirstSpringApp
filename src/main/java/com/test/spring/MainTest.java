package com.test.spring;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainTest {
	public static void main(String[] args) {
		FileSystemXmlApplicationContext ac = new FileSystemXmlApplicationContext("springbeanContext.xml");
		TestSpring ts = ac.getBean(TestSpring.class);
		ts.firstTest();
		ac.close();
	}
}
