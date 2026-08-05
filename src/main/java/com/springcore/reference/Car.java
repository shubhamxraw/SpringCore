package com.springcore.reference;

public class Car {
	private String carName;
	private int modelYear;
	private Engine eng;

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(String carName, int modelYear, Engine eng) {
		super();
		this.carName = carName;
		this.modelYear = modelYear;
		this.eng = eng;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public int getModelYear() {
		return modelYear;
	}

	public void setModelYear(int modelYear) {
		this.modelYear = modelYear;
	}

	public Engine getEng() {
		return eng;
	}

	public void setEng(Engine eng) {
		this.eng = eng;
	}

	@Override
	public String toString() {
		return "Car [carName=" + carName + ", modelYear=" + modelYear + ", eng=" + eng + "]";
	}

}
