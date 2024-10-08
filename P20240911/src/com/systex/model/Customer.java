package com.systex.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class Customer {
	private String id;
	private String name;
	private String address;
	private Date birthDate;
	private char gender;
	private boolean married;
	private String email;

	public Customer() {
		super();
	}

	public Customer(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Customer(String id, String name, String address) {
		// super();
		this(id, name, address, new GregorianCalendar(1900, 0, 1).getTime(), 'U', false, null);
//		this.id = id;
//		this.name = name;
//		this.address = address;
	}

	public Customer(String id, String name, String address, Date birthDate, char gender, boolean married,
			String email) {
		super();
		this.setId(id);
		this.setName(name);
		this.setAddress(address);
		this.setBirthDate(birthDate);
		this.setGender(gender);
		this.setMarried(married);
		this.setEmail(email);
	}

	public boolean checkId(String id) {
		return true;
	}

	public String getId() {
		return id;
	}

	public final void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public final void setAddress(String address) {
		this.address = address;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public final void setBirthDate(Date birthDate) {
		if (birthDate.before(new GregorianCalendar().getTime())) {
			this.birthDate = birthDate;
		} else {
			this.birthDate = new GregorianCalendar(1900, 0, 1).getTime();
		}

	}

	public void setBirthDate(String sDate) {
		try {
			Date birth = SimpleDateFormat.getDateInstance().parse(sDate);
			this.setBirthDate(birth);
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

	public char getGender() {
		return gender;
	}

	public final void setGender(char gender) {
		if (gender == 'M' || gender == 'F') {
			this.gender = gender;
		} else if (gender == 'm' || gender == 'f') {
			char g = Character.toUpperCase(gender);
			this.gender = g;
		} else {
			this.gender = 'U';
		}

	}

	public boolean isMarried() {
		return married;
	}

	public final void setMarried(boolean married) {
		this.married = married;
	}

	public String getEmail() {
		return email;
	}

	public final void setEmail(String email) {
		this.email = email;
	}

	// verify

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", address=" + address + ", birthDate=" + birthDate
				+ ", gender=" + gender + ", married=" + married + ", email=" + email + "]";
	}

}
