package com.systex.main;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class TestSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> fruits = new HashSet<>();
		//Set<String> f = new LinkedHashSet<>();
		//TreeSet<>(); decendingSet
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("cherry");
		fruits.add("lemon");
		fruits.add("apple");
		fruits.add("watermelon");
		System.out.println(fruits);
	}

}
