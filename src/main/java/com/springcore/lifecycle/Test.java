package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/lifecycle/lifecycleConfig.xml");
		Samosa s1 = (Samosa) context.getBean("s1");
		System.out.println(s1);

		Pepsi p1 = (Pepsi) context.getBean("p1");
		System.out.println(p1);

		Certificate c1 = (Certificate) context.getBean("c1");
		System.out.println(c1);

		context.registerShutdownHook();
	}

}
