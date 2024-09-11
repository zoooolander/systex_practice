package com.systex.main;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

import com.systex.model.*;
public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee();
		emp1.name = "Christina";
		emp1.title = "entry level engineer";
		emp1.department = "IT";
		emp1.salary = 35000;
		System.out.println(emp1);
		
		GregorianCalendar gc = new GregorianCalendar();
		System.out.print(SimpleDateFormat.getInstance().format(gc.getTime()));
	}

}
