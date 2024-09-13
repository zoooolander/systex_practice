package com.systex.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// key 的型別為數字和字母才會排序
		Map<Integer, String> fruits = new HashMap<>();
		fruits.put(2, "lemon");
		fruits.put(4, "watermelon");
		fruits.put(1, "apple");
		fruits.put(5, "blueberry");
		fruits.put(3, "avocado");
		System.out.println(fruits);

		Map<Character, String> fruitMap = new HashMap<>();
		fruitMap.put('a', "lemon");
		fruitMap.put('d', "watermelon");
		fruitMap.put('c', "apple");
		fruitMap.put('e', "blueberry");
		fruitMap.put('b', "avocado");
		System.out.println(fruitMap);

		Set<Integer> fruitsKeys = fruits.keySet();
		for (Integer fruitsKey : fruitsKeys) {
			String fruitsValue = fruits.get(fruitsKey);
			System.out.println("key: " + fruitsKey + ", value: " + fruitsValue);
		}

		System.out.println("====================");
		for (Map.Entry<Integer, String> fruitsEntries : fruits.entrySet()) {
			Integer fruitsKey = fruitsEntries.getKey();
			String fruitsValue = fruitsEntries.getValue();
			System.out.println("key: " + fruitsKey + ", value: " + fruitsValue);
		}

		System.out.println("====================");
		fruits.forEach((fruitsKey, fruitsValue) -> System.out.println("key: " + fruitsKey + ", value: " + fruitsValue));
	}

}
