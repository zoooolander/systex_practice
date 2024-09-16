package com.systex.main;

public class AddArguments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int sum = 0;
			for (String number : args) {
				sum += Integer.parseInt(number);
			}
			System.out.println("sum = " + sum);
		} catch (NumberFormatException e) {
			System.out.println("error!!!");
		}
		System.out.println("thanks");

		System.out.println("精緻的處理方式==================");
		int sum = 0;
		for (String number : args) {
			try {
				sum += Integer.parseInt(number);
			} catch (NumberFormatException e) {
				System.out.println("參數[" + number + "]不正確，所以未加總");
			}

		}
		System.out.println("sum = " + sum);
	}

}
