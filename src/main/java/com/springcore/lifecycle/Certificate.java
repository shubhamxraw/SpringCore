package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Certificate {
	private String name;

	public Certificate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Certificate(String name) {
		super();
		System.out.println("Setting the name of certificate...");
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Setting the name of certificate...");
		this.name = name;
	}

	@Override
	public String toString() {
		return "Certificate [name=" + name + "]";
	}

	@PostConstruct
	public void start() {
		System.out.println("Started the Certification...");
	}

	@PreDestroy
	public void end() {
		System.out.println("Ended the Certification...");
	}

}
