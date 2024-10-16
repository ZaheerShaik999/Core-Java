package com.dl.one;

//Encap: Wrappping the data and their methods into a single unit is called enacp...

//The properties will be private
//Setters and Getters
public class Register {

	private String sname;
	private String smobile;
	private String email;
	
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSmobile() {
		return smobile;
	}
	public void setSmobile(String smobile) {
		this.smobile = smobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
