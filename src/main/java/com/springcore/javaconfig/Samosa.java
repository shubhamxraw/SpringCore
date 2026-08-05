package com.springcore.javaconfig;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("cheeseSamosa")
@Scope("prototype")
public class Samosa {

	public void display() {
		System.out.println("My price is little bit High!!!");
	}

}
