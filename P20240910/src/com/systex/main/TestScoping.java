package com.systex.main;

import com.systex.model.Scoping;

public class TestScoping {
	public static void main(String[] args) {
		System.out.println(Scoping.a);
		Scoping s1 = new Scoping();
		System.out.println(s1.b);
		Scoping s2 = new Scoping();
		System.out.println(s2.b);
		s2.b = 100;
		System.out.println(s2.b);
	}
}
