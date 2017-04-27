package com.structuraldesignpattern.decorator;

public abstract class FoodDecorator implements Food {
	// composition
	private Food newFood;

	public FoodDecorator(Food food) {
		this.newFood = food;
	}

	@Override
	public String getFoodDescripton() {

		return this.newFood.getFoodDescripton();
	}

	@Override
	public double getPrice() {
		
		return this.newFood.getPrice();
	}

}
