package com.behavioraldesignpatterns.visitorpattern;

public interface ShoppingItem {
	public double visit(ShoppingCartVisitor visitor);

}
