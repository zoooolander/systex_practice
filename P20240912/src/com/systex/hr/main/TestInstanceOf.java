package com.systex.hr.main;

import com.systex.hr.model.Director;
import com.systex.hr.model.Employee;
import com.systex.hr.model.Manager;

public class TestInstanceOf {
	public static void main(String[] args) {
		Employee e = new Employee();
		Manager m = new Manager();
		Director d = new Director();

		System.out.println(e instanceof Employee);
		System.out.println(e instanceof Manager);
		System.out.println(e instanceof Director);
		System.out.println("=====================");
		System.out.println(m instanceof Object);
		System.out.println(m instanceof Employee);
		System.out.println(m instanceof Manager);
		System.out.println(m instanceof Director);
		System.out.println("=====================");
		System.out.println(d instanceof Employee);

	}

	public static void doStaff(Employee e) {
		if (e instanceof Manager) {
			System.out.println("this employee is a manager");
		} else if (e instanceof Director) {
			System.out.println("this employee is a director");
		}
	}

}
