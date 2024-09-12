package com.systex.hr.model;

public class Director extends Manager{
	private double allowance;

	public Director() {
		super();
	}

	public Director(String name, String telephone, String address, char gender, String department, double allowance) {
		super(name, telephone, address, gender, department);
		this.allowance = allowance;
	}

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return super.getInfo();
	}

	@Override
	public int getSalary() {
		// TODO Auto-generated method stub
		return (int)(super.getSalary()*1.5);
	}

}
