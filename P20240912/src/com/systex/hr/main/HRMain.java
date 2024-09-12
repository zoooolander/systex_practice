package com.systex.hr.main;

import com.systex.hr.model.Accountant;
import com.systex.hr.model.Director;
import com.systex.hr.model.Employee;
import com.systex.hr.model.Engineer;
import com.systex.hr.model.Manager;
import com.systex.hr.model.Secretary;
import com.systex.hr.service.StaffService;

public class HRMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Engineer e1 = new Engineer("Kevin", "25149588", "Taipei", 'M',"CRM");
		Engineer e2 = new Engineer("Mary", "25149098", "Taipei", 'F',"CRM");
		Engineer e3 = new Engineer("Gary", "25141234", "Taoyuan", 'M',"HR");
		Manager m1 = new Manager("Richard", "82189595", "Taipei", 'M',"IT");
		Manager m2 = new Manager("Kelly", "82189000", "Taipei", 'F',"Education");
		Accountant a1 = new Accountant("Erin", "25149333", "Taipei", 'F',"IT,Sales");
		Director d1 = new Director("Frank", "82188888", "Taipei", 'M',"IT", 2000000);
		Secretary s1 = new Secretary("Peggy", "25149666", "Taipei", 'F',"Frank");

		Employee[] staff = { e1, e2, e3, m1, m2, a1, d1, s1 };
		StaffService staffService = new StaffService();
		System.out.println("Staff Report");
		System.out.println("===================================");
		System.out.println("Name\tTelepohone\tAddress\tGender\tMisc");
		System.out.println("===================================");
		staffService.generateReport(staff);
		System.out.println("===================================");
		System.out.println("All Salary = " + staffService.calculateAllSalary(staff));
	}

}
