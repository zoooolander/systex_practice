package com.systex.main;

public class TestForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for loop
		for (int i = 0; i < 10; i++) {
			System.out.println("loop" + i);
		}
		
		System.out.println();
		// while loop
		int j = 0;
		while (j < 10) {
			System.out.println("#loop" + j);
			j++;
		}
		
		System.out.println();
		// do while loop
		int k = 0;
		do {
			System.out.println("%loop" + k);
			k++;
		} while (k < 10);
	}

}
