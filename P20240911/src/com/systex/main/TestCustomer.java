package com.systex.main;

import java.util.GregorianCalendar;

import com.systex.model.Customer;

public class TestCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1 = new Customer("A123456789", "Alex", null, new GregorianCalendar(1978, 9, 11).getTime(), 'M', false,
				null);
		// incorrect example
		Customer c2 = new Customer("B223456789", "Barbie", null, new GregorianCalendar(2028, 9, 11).getTime(), 'f',
				false, null);
		System.out.println(c2);
	}

}
