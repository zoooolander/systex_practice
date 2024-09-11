package com.systex.main;

import com.systex.model.MyDate;
import com.systex.service.Pass;

public class PassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 100;
		Pass p = new Pass();
		p.changeIntValue(a);
		System.out.println("a= " + a);
		MyDate d = new MyDate(24, 8, 2015);
		p.changeObjectReference(d);
		System.out.println("d= " + d);
		p.changeOjectValue(d);
		System.out.println("d= " + d);
	}

}
