package com.systex.main;

public class PrintStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int height = 5;

		// loop1
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// loop2
		for (int i = height; i >= 1; i--) {

		}
	}

}
