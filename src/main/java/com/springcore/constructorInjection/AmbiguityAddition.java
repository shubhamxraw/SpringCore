package com.springcore.constructorInjection;

public class AmbiguityAddition {
	private int a;
	private int b;

	// Which constructor is written first will be called first
	public AmbiguityAddition(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("Constructor : int, int");
	}

	public AmbiguityAddition(double a, double b) {
		this.a = (int) a;
		this.b = (int) b;
		System.out.println("Constructor : double, double");
	}

	// But if the type is not defined in the config.xml
	// String type constructor will be given preference
	public AmbiguityAddition(String a, String b) {
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("Constructor : String, String");
	}
}
