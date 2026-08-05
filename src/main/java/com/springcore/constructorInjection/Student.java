package com.springcore.constructorInjection;

import java.util.List;

public class Student {
	private String name;
	private int id;
	private Certificate cert;
	List<String> phone;

	public Student() {
		super();
	}

	public Student(String name, int id, Certificate cert, List<String> phone) {
		super();
		this.name = name;
		this.id = id;
		this.cert = cert;
		this.phone = phone;
	}

	@Override
	public String toString() {
		System.out.println(phone);
		return this.name + " : " + this.id + " : " + this.cert.getName();
	}

}
