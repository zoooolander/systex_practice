package org.animal.model;

public class Dog extends Animal implements Pet{

	@Override
	public void makeNoice() {
		// TODO Auto-generated method stub
		//super.makeNoice();
		System.out.println("bark bark bark!!!");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		//super.move();
	}
	
	// 若implement兩種interface可能會導致「多重繼承」的問題，
	//實作的 interface 裡有相同的 method signature 時，子類別將其多種 interface 裡的 method 視為 abstract，在子類別裡實作
	@Override
	public void bar() {
		// TODO Auto-generated method stub
		Pet.super.bar();
		System.out.println("added in sub class dog");
	}

}
