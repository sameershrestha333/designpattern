package com.structuraldesignpattern.decorator;

public class VegFood implements Food {

	@Override
	public String getFoodDescripton() {

		return "Very good";
	}

	@Override
	public double getPrice() {

		return 5.5;
	}

}
