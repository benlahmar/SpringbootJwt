package com.example.demo.rest;

public class RegistrationForm {

	private String username;  
	private String password;  
	private String repassword;
	protected String getUsername() {
		return username;
	}
	protected void setUsername(String username) {
		this.username = username;
	}
	protected String getPassword() {
		return password;
	}
	protected void setPassword(String password) {
		this.password = password;
	}
	protected String getRepassword() {
		return repassword;
	}
	protected void setRepassword(String repassword) {
		this.repassword = repassword;
	}
	
	

}
