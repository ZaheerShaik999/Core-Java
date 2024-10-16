package com.dl.one;

public class RegisterImpl extends Register{

	public static void main(String[] args) {
		
		RegisterImpl register = new RegisterImpl();
		
		register.setSname("sai kiran");
		register.setSmobile("9876543210");
		register.setEmail("saikiran@gmail.com");
		
		System.out.println(register.getSname());
		System.out.println(register.getSmobile());
		System.out.println(register.getEmail());
		
		
	}
}
