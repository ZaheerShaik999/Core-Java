package com.dl.foour;

//In Abs class can we have Abs Method, but i need only one abs method implementation
abstract class A{
	
	public abstract void m1();
	public abstract void m2();
	
}

abstract class B extends A{
	
	@Override
	public void m1() {
		System.out.println("M1 Method");
	}
}

class C extends B{

	@Override
	public void m2() {
		
		System.out.println("M2 Method");
	}
	
	
}
public class Client4 {

	public static void main(String[] args) {
		
		C c = new C();
		c.m1();
		c.m2();
	}
}
