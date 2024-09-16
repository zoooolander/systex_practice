package com.systex.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		// 1. 讓使用者輸入需要產生的組數
		System.out.print("請輸入需要產生幾組號碼：");
		int numberOfSets = scanner.nextInt();
		int totalNumbers = numberOfSets * 6; // 每組 6 個數字
		scanner.nextLine();// 讀取緩衝區的換行符號

		// 2. 讓使用者輸入需要排除的5個數字
		Set<Integer> excludeNumbers = new HashSet<>();
		while (true) {
			System.out.println("請輸入5個需要排除的數字 (範圍 1~49，以空格分隔)：");
			String input = scanner.nextLine();
			String[] inputNumbers = input.split(" ");

			// 2.1. 判斷是否為5個數字
			if (inputNumbers.length != 5) {
				System.out.println(inputNumbers.length);
				System.out.println("請輸入正好 5 個數字！");
				continue; // 重新要求輸入
			}

			// 2.2. 判斷5個數字是否皆在1~49中
			excludeNumbers.clear(); // 每次重新輸入需要清空之前的數字
			boolean isValid = true;
			for (String numStr : inputNumbers) {
				try {
					int num = Integer.parseInt(numStr);
					if (num >= 1 && num <= 49 && !excludeNumbers.contains(num)) {
						excludeNumbers.add(num);
					} else {
						System.out.println("數字需介於 1~49 且不能重複！");
						isValid = false;
						break;
					}
				} catch (NumberFormatException e) {
					System.out.println("請輸入有效的整數！");
					isValid = false;
					break;
				}
			}

			if (isValid && excludeNumbers.size() == 5) {
				break; // 若輸入有效且正好 5 個數字，跳出迴圈
			}
		}
		scanner.close();

		// 3. 產生樂透號碼
		List<Set<Integer>> lotteryNumbers = generateLotteryNumbers(excludeNumbers, totalNumbers);

		// 4. 顯示排序後的結果
		for (int i = 0; i < numberOfSets; i++) {
			List<Integer> sortedNumbers = new ArrayList<>(lotteryNumbers.get(i));
			Collections.sort(sortedNumbers); // 將號碼排序
			System.out.println("第 " + (i + 1) + " 組號碼：" + sortedNumbers);
		}
	}

	/*
	 * @Description 產生樂透號碼
	 */
	public static List<Set<Integer>> generateLotteryNumbers(Set<Integer> excludeNumbers, int totalNumbers) {
		List<Set<Integer>> result = new ArrayList<>();
		Random random = new Random();
		Set<Integer> numbers;

		while (result.size() * 6 < totalNumbers) {
			numbers = new HashSet<>();
			while (numbers.size() < 6) {
				int randomNumber = random.nextInt(49) + 1;
				// 排除已經在 excludeNumbers 中的數字
				if (!excludeNumbers.contains(randomNumber)) {
					numbers.add(randomNumber);
				}
			}
			result.add(numbers); // 加入這組號碼
		}
		return result;
	}

}
