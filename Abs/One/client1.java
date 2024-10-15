package com.dl.one;

//Abs class contain abs method and non abs method(concerte method)
abstract class A {

	// Abs Method
	public abstract void show();

	// Non Abs Method
	public void dipslay() {
		System.out.println("display method()");
	}

}

class B extends A {

	//In class child B we are overdridng the show() method of class A
	@Override
	public void show() {

		System.out.println("show() method");

	}

}

public class Client1 {

	public static void main(String[] args) {

		A a = new B();
		a.show();
		a.dipslay();
	}
}
