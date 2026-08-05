package com.springcore.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCI {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/constructorInjection/CIconfig.xml");
		Student s1 = (Student) context.getBean("Shubham");
		System.out.println(s1);

		AmbiguityAddition add = (AmbiguityAddition) context.getBean("add");
	}

}
