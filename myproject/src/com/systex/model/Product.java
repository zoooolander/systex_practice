package com.systex.model;

public class Product {
	private long id;
	private String name;
	private double unitPrice;
	private boolean free;
	private int stock;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isFree() {
		return free;
	}

	public void setFree(boolean free) {
		this.free = free;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public void incStock(int amount) {
		this.stock += amount;
	}

	public void decStock(int amount) {
		this.stock -= amount;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		if (unitPrice > 0) {
			this.unitPrice = unitPrice;
		} else {
			this.unitPrice = 9999;
			// throw new RuntimeException("Price is incorrect");
		}
	}
	
	// constructor be overload
	// no args constructor, default constructor
	public Product() {

	}
	
	//constructor
	public Product(long id, String name) {
		this(id, name, 0, false, 0);
	}
	
	// all args constructor
	// 可將參數檢查邏輯寫進來這裡
	public Product(long id, String name, double unitPrice, boolean free, int stock) {
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.free = free;
		this.stock = stock;
	}

	public String toString() {
		return id + "\t" + name + "\t" + unitPrice + "\t" + free + "\t" + stock;
	}
}
