package com.springcore.reference;

public class Engine {
	private int engineNumber;
	private String type;

	public Engine() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Engine(int engineNumber, String type) {
		super();
		this.engineNumber = engineNumber;
		this.type = type;
	}

	public int getEngineNumber() {
		return engineNumber;
	}

	public void setEngineNumber(int engineNumber) {
		this.engineNumber = engineNumber;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Engine [engineNumber=" + engineNumber + ", type=" + type + "]";
	}

}
