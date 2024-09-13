package com.systex.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 泛型的話 collection 可以加入任何型別的資料，若要取出內容物件，取出時需要轉型
		List<String> fruits = new ArrayList<>();
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("cherry");
		fruits.add("lemon");
		fruits.add("apple");
		fruits.add("watermelon");
		System.out.println(fruits);
		Collections.sort(fruits);
		System.out.println(fruits);
		System.out.println("==================");
		for (int i = 0; i < fruits.size(); i++) {
			String fruit = fruits.get(i);
			System.out.println(fruit);
		}
		System.out.println("==================");
		Iterator it = fruits.iterator();
		while (it.hasNext()) {
			String fruit = (String) it.next();
			System.out.println(fruit);
		}
		fruits.forEach(fruit -> System.out.println(fruit));
	}

}
