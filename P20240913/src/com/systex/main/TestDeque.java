package com.systex.main;

import java.util.LinkedList;

public class TestDeque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> fruits = new LinkedList<>();
		fruits.add("Lemon");
		fruits.addLast("Watermelon");//add = addLast
		fruits.addFirst("Pineapple");
		fruits.push("Cherry");
		fruits.add("Strawberry");
		System.out.println(fruits);
		System.out.println(fruits.pollFirst());//poll = pollFirst
		System.out.println(fruits);
		System.out.println(fruits.pollLast());
		System.out.println(fruits);
	}

}
