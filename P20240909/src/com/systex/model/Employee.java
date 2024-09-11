package com.systex.model;

public class Employee {
	public String name;
	public String title;
	public String department;
	public int salary;

	public String toString() {//自動繼承object類別
		return name + "\n" + title + "\n" + department + "\n" + salary;
	}
}
