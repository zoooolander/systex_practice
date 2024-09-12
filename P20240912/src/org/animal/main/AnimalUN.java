package org.animal.main;

import org.animal.model.American;
import org.animal.model.Animal;
import org.animal.model.Dog;
import org.animal.model.Pet;
import org.animal.model.Cat;

public class AnimalUN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Animal d = new Dog();
//		Animal c = new Cat();
//		
//		d.makeNoice();//virtual method invocation(VMI), dynamic binding
//		c.makeNoice();

		Dog dog = new Dog();
		Cat cat = new Cat();
		American american = new American();
		speech(dog);
		speech(cat);

		bilateralTalks(dog, cat);
		discussion(dog, cat, american);

		// 引用 non-static 的 method，需先事先 new 出物件
		AnimalUN animalUN = new AnimalUN();
		animalUN.method(dog);
		
		
		dog.bar();
		Pet.foo();//若 main 需要使用 foo()，需透過 interface 去 call 該 method
		//dog.foo(); error: 不能藉由子類別去 call method
	}

	public static void speech(Animal a) {
		a.makeNoice();
	}

	public static void bilateralTalks(Animal a1, Animal a2) {
		a1.makeNoice();
		a2.makeNoice();
	}

	public static void discussion(Animal... animals) {
		for (Animal a : animals) {
			a.makeNoice();
		}
	}

	public void method(Animal a) {
		a.move();
	}

}
