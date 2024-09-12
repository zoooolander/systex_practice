package com.systex.hr.model;

import static java.lang.Math.*;

public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
		System.out.println(Account.getInterestRate());
		Account account1 = new Account(100);
		System.out.println(account1.getInterestRate());
		Account account2 = new Account(200);
		System.out.println(account2.getInterestRate());
		Account.setInterestRate(0.03);

		System.out.println(account1.getInterestRate());
		System.out.println(account2.getInterestRate());

		int r = 5;
		System.out.println(PI * pow(r, 2));
		long end = System.currentTimeMillis();
		System.out.println(end-start);
	}

}
