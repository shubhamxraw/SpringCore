package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/stereotype/stereotypeConfig.xml");

		// it takes the bean name "student"(in camelCase) automatically from the class
		// name Student
//		Student s1 = context.getBean("student", Student.class);

		// when declared the name explicitly in the @Component annotation
		Student s1 = context.getBean("s1", Student.class);
		System.out.println(s1.hashCode());

		System.out.println(s1);
		System.out.println(s1.getBestFriendsList());

		Student s2 = context.getBean("s1", Student.class);
		System.out.println(s2.hashCode());
	}

}
