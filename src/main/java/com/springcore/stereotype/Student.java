package com.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("s1")
@Scope("prototype")
public class Student {

	@Value("Shubham")
	private String studentName;
	@Value("Ghaziabad")
	private String city;
	@Value("#{bestFriends}")
	private List<String> bestFriendsList;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String studentName, String city) {
		super();
		this.studentName = studentName;
		this.city = city;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<String> getBestFriendsList() {
		return bestFriendsList;
	}

	public void setBestFriendsList(List<String> bestFriendsList) {
		this.bestFriendsList = bestFriendsList;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + "]";
	}

}
