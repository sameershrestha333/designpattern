package com.structuraldesignpattern.decorator;

public class Chinese extends FoodDecorator{

	public Chinese(Food food) {
		super(food);		
	}

	@Override
	public String getFoodDescripton() {
		
		return super.getFoodDescripton()+" With Fried Rice and Manchurian  ";   
	}

	@Override
	public double getPrice() {
		return super.getPrice()+ 5.0;
	}
}
