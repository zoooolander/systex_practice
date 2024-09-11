package com.systex.model;

public class Child extends Parent{

	public Child(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	//error: 父類別沒有定義無參數的建構子，因此子類別會找不到可繼承的建構子 
//	public Child() {
//		super();
//	}
}
