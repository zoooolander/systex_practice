package com.systex.main;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// print Fib. that<1000
		int i = 0;
		int fibValue = fibonacci(i);
		int limit = 1000;
		
		while (fibValue < limit) {
			System.out.print(fibValue + " ");
			i++;
			fibValue = fibonacci(i);
		}

	}

	public static int fibonacci(int n) {
		if (n <= 1) {
			return n;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}

	}

}
