package com.systex.main;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// print Fib. that<1000
		int n = 1000;
		for (int i = 0; i < n; i++) {
			System.out.print(fibonacci(i) + " ");
		}

	}

	public static int fibonacci(int n) {
		if (n <= 1) {
			return n;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

}
