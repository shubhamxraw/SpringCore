package com.springcore.auto.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/auto/wire/autoConfig.xml");

		Employee e1 = context.getBean("employee2", Employee.class);

		System.out.println(e1);
	}

}
