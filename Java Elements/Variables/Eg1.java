package com.dl.variables;

public class Eg1 {

	//Types of Variables: Static v and Instance v and Local v
	//Types of Methods: Static M and Instance M
	//Types of Blocks: Static B and Instance B
	//Types of Constructor: Zero Arg-Cons, Parameterized Cons
	
    //Static V: Static v are written inside the class and out the side method
	//We can call static v directly in the main method and in any other method
	//We can call static v using class name even
	static int  a = 10;
	static int b = 20;
	
	//Instance v are written inside class and out side the method
	//We can call Instance v by calling new keyword and className()
	int x = 100;
	int y = 200;
	
	public static void main(String[] args) {
		
		//System.out.println(a);
		//System.out.println(b);
		
		//ClassName.staticV
		System.out.println(Eg1.a);
		System.out.println(Eg1.b);
		
		//new ClassName().instanceV
		//System.out.println(new Eg1().x);
		//System.out.println(new Eg1().y);
		
		//Constructor 
		//ClassName objectRef = new ClassName();
		Eg1 eg1 = new Eg1();
		System.out.println(eg1.x);
		System.out.println(eg1.y);
		
		//local variables
		//local variables are declared inside main method and any other method
		int i = 1000;
		int j = 2000;
		System.out.println(i);
		System.out.println(j);
		
	}
}
