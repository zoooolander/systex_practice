package com.systex.main;

public class FindingPrimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// find out all prime that < 1000
		System.out.print("2 ");
		for (int i = 3; i < 1000; i+=2) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
	}

	public static boolean isPrime(int n){
		if(n<=1){
			return false;
		}
		// 只需檢查到 n 的平方根
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;  // 若能被整除，則不是質數
            }
        }
        return true;
	}

}
