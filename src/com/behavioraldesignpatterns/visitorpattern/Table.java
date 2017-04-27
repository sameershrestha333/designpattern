package com.behavioraldesignpatterns.visitorpattern;

public class Table implements ShoppingItem {
	public String type;
	public double price;
	
	

	

	public Table(String type, double price) {
		super();
		this.type = type;
		this.price = price;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public double visit(ShoppingCartVisitor visitor) {
		
		return visitor.visit(this);
	}

}
