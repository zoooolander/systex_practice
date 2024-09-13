package com.systex.main;

public class PrintStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int height = Integer.parseInt(args[0]);

		// loop1: Right Triangle Star Pattern
		System.out.println("loop 1");
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		// loop2
		System.out.println("loop 2");
		for (int i = 1; i <= height; i++) {
			for (int j = height; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		// loop3
		System.out.println("loop 3");
		for (int i = 1; i <= height; i++) {
			for (int j = height - 1; j >= i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		// loop4: Pyramid Star Pattern
		System.out.println("loop 4");
		for (int i = 1; i <= height; i++) {
			for (int j = height - 1; j >= i; j--) {
				System.out.print(" ");
			}
			// print (2*height-1) star
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		// loop 5
		System.out.println("loop 5");
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = height; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		// loop 6
		System.out.println("loop 6");
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * (height - i + 1) - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		//loop 7: Diamond Shape Pattern
		System.out.println("loop 7");
		for (int i = 1; i <= height; i++) {
			//上半部分
            for (int j = height - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // 下半部分
        for (int i = height - 1; i >= 1; i--) {
            for (int j = height - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
	}

}
