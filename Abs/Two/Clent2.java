package com.dl.two;

//Task 2: Abs class contain static v and instance v, but static v are called in abs class but not instance v 
public abstract class Client2 {

	int a = 10;
	static int b = 20;

	public static void main(String[] args) {

		System.out.println(b); // 20
		
		//We cannot create an object of abs class, we can create it in child class
		//Client2 c = new Client2();  // Cannot instantiate the type Client2
		
	}
}
