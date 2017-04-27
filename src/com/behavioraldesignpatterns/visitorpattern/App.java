package com.behavioraldesignpatterns.visitorpattern;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		List<ShoppingItem> shoppingItems = new ArrayList<>();

		shoppingItems.add(new Table("table1", 10));
		shoppingItems.add(new Table("table2", 5));
		shoppingItems.add(new Table("table3", 15));
	
		ShoppingCartVisitor visitor=new ShoppingCart();
		double sum=0;
		for(ShoppingItem sp:shoppingItems)
			sum+=sp.visit(visitor);
		
		System.out.println("Total Price :"+sum);

	}

}
