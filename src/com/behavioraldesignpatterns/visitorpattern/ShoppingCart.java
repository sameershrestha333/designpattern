package com.behavioraldesignpatterns.visitorpattern;

public class ShoppingCart implements ShoppingCartVisitor {

	public ShoppingCart() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public double visit(Table table) {
		return table.getPrice();
	}

	@Override
	public double visit(Chair chair) {
		// TODO Auto-generated method stub
		return chair.getPrice();
	}

}
