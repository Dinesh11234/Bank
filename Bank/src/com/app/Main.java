package com.app;

import java.util.*;

public class Main {
	static void deposite(UserDetails us) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the initial amount");
		int deposite = in.nextInt();
		Bank bank = new Bank();
		bank.depositeMoney(us, deposite);
		
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double otp = Math.random()*10000;
		Bank b = new Bank();
		boolean is = true;
		while(is) {
			System.out.println("Enter your choice");
			System.out.println("1.Add user");
			System.out.println("2.Deposite");
			System.out.println("3.Withdraw");
			System.out.println("4.Available Balance");
			System.out.println("5.Exit");
			int choice = in.nextInt();
			switch(choice) {
			case 1:{
				System.out.println("Enter your Details");
				in.nextLine();
				
				System.out.println("Enter id");
				int id = in.nextInt();
				in.nextLine();
				
				System.out.println("Enter Name");
				String name = in.nextLine();
				
				System.out.println("Enter Mobile No");
				long mobile = in.nextLong();
				
				System.out.println();
				System.out.println("verify your mobile number "+(int)otp);
				int verify = in.nextInt();
				
				if(verify==(int)otp) {
				System.out.println("Enter four digit Pin No");
				int pin = in.nextInt();
				
				UserDetails us = new UserDetails(id,name,mobile,pin);
				deposite(us);
				}
				else
					break;
			}
				break;
			case 2:
				System.out.println("Enter your Id");
				int userId = in.nextInt();
				b.deposite(userId);
				
				break;
			case 3:
				System.out.println("Enter your Id");
				int uId = in.nextInt();
				b.withDraw(uId);
				break;
			case 4:{
				System.out.println("Enter your Id");
				int userID = in.nextInt();
				b.display(userID);
			}
				break;
			case 5:
				is = false;
				System.out.println("  Thank You :) ");
			}
		}
		in.close();
	}

}
