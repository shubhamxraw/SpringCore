package com.springcore.standalone.collections;

import java.util.List;

public class Employee {
	private List<String> friends;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(List<String> friends) {
		super();
		this.friends = friends;
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	@Override
	public String toString() {
		return "Employee [friends=" + friends + "]";
	}

}
