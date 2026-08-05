package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("coursesClass")
public class Course {
	@Value("#{new java.lang.String('Java')}")
	private String courseName;
	@Value("#{(5000)+((5000*18)/100)}")
	public int price;
	@Value("#{T(java.lang.Math).sqrt(144)}")
	private double sqRoot;
	@Value("#{T(java.lang.Math).PI}")
	private double PIValue;
	@Value("#{8>3}")
	private boolean isActive;

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getSqRoot() {
		return sqRoot;
	}

	public void setSqRoot(double sqRoot) {
		this.sqRoot = sqRoot;
	}

	public double getPIValue() {
		return PIValue;
	}

	public void setPIValue(double pIValue) {
		PIValue = pIValue;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "Course [courseName=" + courseName + ", price=" + price + ", sqRoot=" + sqRoot + ", PIValue=" + PIValue
				+ ", isActive=" + isActive + "]";
	}

}
