package com.dl.six;

public interface Client {
	
	//java 8
	public static void m1() {
		
		System.out.println("M1 Method");
	}
	
	default void m2() {
		System.out.println("M2 Method");
	}

	public static void main(String[] args) {
		
		m1();
		
	}
}
