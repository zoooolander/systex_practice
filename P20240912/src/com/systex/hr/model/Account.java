package com.systex.hr.model;

public class Account {
	private static double interestRate = 0.02;
	private int balance;
	private static final int MYCONST;
	static {
		MYCONST = 10;
		System.out.println("hello world~");
		// eg. load database data
		// 執行應用程式的初始化作業
		// kind of class' constructor
	}

	//run time 時期的常數，透過 constructor 將 value 指派給它
	public Account(int balance) {
		this.balance = balance;
	}

	public static double getInterestRate() {
		return interestRate;
	}

	public static void setInterestRate(double interestRate) {
		if (interestRate >= 0) {
			Account.interestRate = interestRate;
		}
	}

	public int getBalance() {
		return this.balance;
	}

	public void deposit(int amt) {
		this.balance += amt;
	}

	public void withdraw(int amt) {
		this.balance -= amt;
	}
}
