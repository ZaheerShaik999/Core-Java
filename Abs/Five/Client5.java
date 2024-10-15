package com.dl.five;

//Abs class calling the normal class
class A {

	public void m1() {
		System.out.println("M1 Method");
	}

}

abstract class B extends A {

	public void m2() {
		System.out.println("M2 Method");
	}

	public abstract void m3();
}

class C extends B {

	@Override
	public void m3() {

		System.out.println("M3 Method");
	}

}

public class Client5 {

	public static void main(String[] args) {

		//Multi Level
		C c = new C();
		c.m1();
		c.m2();
		c.m3();
		
		
	}
}
