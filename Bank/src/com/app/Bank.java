package com.app;

import java.util.*;

public class Bank {
	Scanner in = new Scanner(System.in);
	static HashMap <Integer,UserDetails> map = new HashMap<>();
	void depositeMoney(UserDetails us,int amount){
		us.balance=amount;
		map.put(us.id, us);
		System.out.println(us.id);
		System.out.println(us.balance);
	}
	void deposite(int id){
		for(Map.Entry<Integer, UserDetails> entry : map.entrySet()) {
			if(entry.getKey()==id) {
				System.out.println("Enter amount");
				int amount = in.nextInt();
				entry.getValue().balance+=amount;
				System.out.println("Transaction successful");
			}
		}
	}
	void withDraw(int id) {
		for(Map.Entry<Integer, UserDetails> entry : map.entrySet()) {
			if(entry.getKey()==id) {
				System.out.println("Enter amount");
				int amount = in.nextInt();
				entry.getValue().balance-=amount;
				System.out.println("Transaction successful");
			}
		}
	}
	void display(int id) {
		for(Map.Entry<Integer, UserDetails> entry : map.entrySet()) {
			if(entry.getKey()==id) {
			System.out.println("ID : "+entry.getValue().id);
			System.out.println("Name : "+entry.getValue().name);
			System.out.println("Mobile : "+entry.getValue().mobile);
			System.out.println("Balance : "+entry.getValue().balance);
			}
		}
	}
	
}
