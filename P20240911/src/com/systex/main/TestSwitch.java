package com.systex.main;

public class TestSwitch {
	public static void main(String[] args) {
		int carModel = Integer.parseInt(args[0]);
		switch (carModel) {
		case 1:
			System.out.println("天窗");
		case 2:
			System.out.println("air conditioner");
		case 3:
			System.out.println("音響");
		default:
			System.out.println("wheel");
			System.out.println("engine");

		}
	}
}
