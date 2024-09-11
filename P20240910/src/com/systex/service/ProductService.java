package com.systex.service;

import com.systex.model.*;

public class ProductService {
	public double calculateProductInventory(Product product) {
		return product.getUnitPrice() * product.getStock();
	}
}
