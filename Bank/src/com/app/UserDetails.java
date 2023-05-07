package com.app;

public class UserDetails {
	int id;
	String name;
	long mobile;
	int pin;
	int balance;
	public UserDetails(int id, String name, long mobile, int pin) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.pin = pin;
		balance = -1;
	}
	
}
