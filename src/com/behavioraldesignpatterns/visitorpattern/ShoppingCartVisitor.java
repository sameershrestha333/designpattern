package com.behavioraldesignpatterns.visitorpattern;

public interface ShoppingCartVisitor {
	public double visit(Table table);
	public double visit(Chair chair);


}
