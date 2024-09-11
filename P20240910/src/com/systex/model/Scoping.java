package com.systex.model;

public class Scoping {
	public static int a;//class variable
	public int b;//member variable, attribute, instance variable, field
	public final int MYCOUNT = 100;//compile time constant
	
	//run time constant
	public Scoping() {
		
	}
	
	public void callMe(int c, int d) {
		//e, f為區域變數，使用前須初始化
		int e;
		if(c>10) {
			int f;
		}
	}
	
	long g = 123L;
}
