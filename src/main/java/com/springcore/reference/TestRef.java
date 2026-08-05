package com.springcore.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRef {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/reference/ReferenceConfig.xml");
		Car i20N = (Car) context.getBean("i20N");

		System.out.println(i20N.getCarName());
		System.out.println(i20N.getEng());

	}

}
