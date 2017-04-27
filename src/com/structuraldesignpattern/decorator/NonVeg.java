package com.structuraldesignpattern.decorator;

public class NonVeg extends FoodDecorator {

	public NonVeg(Food food) {
		super(food);
	}

	@Override
	public String getFoodDescripton() {
		return super.getFoodDescripton() + " With Roasted Chiken and Chiken Curry  ";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return super.getPrice() + 3;
	}
}
