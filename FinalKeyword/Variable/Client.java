package com.dl.variable;

//final keyword: if a variable declared as final keyword we cannot re-assign it
public class Client {

	public static void main(String[] args) {
		
		final int a = 10;
		
		a = 20;
		
		System.out.println(a);
		
	}
}
