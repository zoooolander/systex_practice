package com.systex.main;

public class TestOperate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a = 1;
		byte b = 1;
		byte c = (byte) (a + b);// 因為 java 會先將 a, b 轉成 int，所以須轉型成 byte

		int age = 50;
		System.out.println(age * 365L * 24 * 60 * 60 * 1000);// java 會先找出運算式最大的型別，轉型後再進行運算

		System.out.println(111 + 222 + 333);
		System.out.println("111" + 222 + 333);
		System.out.println(111 + "222" + 333);
		System.out.println(111 + 222 + "333");

		int x = 5;
		int y = 5;
		int z = 5;

		// 短路型，&&
		System.out.println("\n短路型，&&");
		if ((++x) > 10 && (++y) > 10 && (++z) > 10) {
			System.out.println("bingo");
		}
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("z = " + z);

		// 短路型，||
		System.out.println("\n短路型，||");
		x = 5;
		y = 5;
		z = 5;
		if ((++x) > 10 || (++y) > 10 || (++z) > 10) {
			System.out.println("bingo");
		}
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("z = " + z);

		// 非短路型，&
		System.out.println("\n非短路型，&");
		x = 5;
		y = 5;
		z = 5;
		if ((++x) > 10 & (++y) > 10 & (++z) > 10) {
			System.out.println("bingo");
		}
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("z = " + z);

		// 非短路型，|
		System.out.println("\n非短路型，|");
		x = 5;
		y = 5;
		z = 5;
		if ((++x) > 10 | (++y) > 10 | (++z) > 10) {
			System.out.println("bingo");
		}
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("z = " + z);
	}

}
