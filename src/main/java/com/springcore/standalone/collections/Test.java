package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/standalone/collections/scConfig.xml");
		Employee emp1 = context.getBean("Emp1", Employee.class);
		System.out.println(emp1);
		System.out.println(emp1.getFriends().getClass().getName());
	}

}
