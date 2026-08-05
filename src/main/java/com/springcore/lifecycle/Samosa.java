package com.springcore.lifecycle;

public class Samosa {
	private double price;

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Samosa(double price) {
		super();
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting Samosa Price...");
		this.price = price;
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}

	// can name anything
	public void init() {
		System.out.println("Initializing the Samosa...");
	}

	// can name anything
	public void destroy() {
		System.out.println("Destroying the Samosa...");
	}

}
