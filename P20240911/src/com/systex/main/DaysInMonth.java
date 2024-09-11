package com.systex.main;

public class DaysInMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);

		switch (month) {
		default:
			System.out.println("!@#$%^&*()");
			break;
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31days");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30days");
			break;
		case 2:
			if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
				System.out.println("29days");
			} else {
				System.out.println("28days");
			}
		}
	}

}
