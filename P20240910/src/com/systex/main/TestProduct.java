package com.systex.main;
import com.systex.model.*;
import com.systex.service.ProductService;
public class TestProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product();
		p1.setId(0001L);
		p1.setName("elderflower syrup");
		p1.setUnitPrice(2.99);
		p1.setFree(false);
		p1.incStock(2000);
		
		Product p2 = new Product();
		p2.setId(0002L);
		p2.setName("shark");
		p2.setUnitPrice(25);
		p2.setFree(false);
		p2.incStock(20000);
		
		Product p3 = new Product(0003L, "rag", 1, false, 16000);
		Product p4 = new Product(0004L, "sheet", 20, false, 15000);
		Product p5 = new Product(0005L, "bed", 200, false, 1000);
		Product p6 = new Product(0006L, "cabinet");
		
		ProductService ps = new ProductService();
		
		
		System.out.println("Product Stock Table");
		System.out.println("==============================================");
		System.out.println("序號\t品名\t單價\t贈品\t庫存量");
		System.out.println(p1+"\t"+ps.calculateProductInventory(p1));
		System.out.println(p2+"\t"+ps.calculateProductInventory(p2));
		System.out.println(p3+"\t"+ps.calculateProductInventory(p3));
		System.out.println(p4+"\t"+ps.calculateProductInventory(p4));
		System.out.println(p5+"\t"+ps.calculateProductInventory(p5));
		System.out.println(p6+"\t"+ps.calculateProductInventory(p6));
		System.out.println("==============================================");
	}

}
