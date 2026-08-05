package com.springcore.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

	private Samosa samosa;

	@Value("Aloo Samosa")
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Samosa getSamosa() {
		return samosa;
	}

	@Autowired
	@Qualifier("cheeseSamosa")
	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}

	public void study() {
		System.out.println(name);
		this.samosa.display();
		System.out.println("Student is reading book!!!");
	}

}
