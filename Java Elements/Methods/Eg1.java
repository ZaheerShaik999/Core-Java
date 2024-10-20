package com.dl.methods;

public class Eg1 {

	// Methods
	// instance Method, return type is void
	public void add() {
		System.out.println("add method");
	}

	// static method, return type is void
	public static void get() {
		System.out.println("get method");
	}

	public static void main(String[] args) {
		
		get();
		
		Eg1.get();
		
		
		new Eg1().add();
		
		Eg1 eg1 = new Eg1();
		eg1.add();
		
	}
}
