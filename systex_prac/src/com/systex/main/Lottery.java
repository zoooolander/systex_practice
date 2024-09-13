package com.systex.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 設定排除的數字
        Set<Integer> excludeNumbers = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Scanner scanner = new Scanner(System.in);

        // 輸入需要產生的組數
        System.out.print("請輸入需要產生幾組號碼：");
        int numberOfSets = scanner.nextInt();
        int totalNumbers = numberOfSets * 6; // 每組 6 個數字

        // 產生樂透號碼
        List<Set<Integer>> lotteryNumbers = generateLotteryNumbers(excludeNumbers, totalNumbers);

        // 顯示排序後的結果
        for (int i = 0; i < numberOfSets; i++) {
            List<Integer> sortedNumbers = new ArrayList<>(lotteryNumbers.get(i));
            Collections.sort(sortedNumbers); // 將號碼排序
            System.out.println("第 " + (i + 1) + " 組號碼：" + sortedNumbers);
        }
    }

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
