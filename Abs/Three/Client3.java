package com.dl.three;

public abstract class Client3 {

	//Task 3: Abs class contain static b and instance b but static b is called in abs class but not instance b
	public static void main(String[] args) {
		
		//new Client3();
	}
	
	static{
		System.out.println("Static Block");
	}
	
	{
		System.out.println("Instance Block");
	}
}
