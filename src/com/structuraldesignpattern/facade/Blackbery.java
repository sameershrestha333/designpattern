package com.structuraldesignpattern.facade;

public class Blackbery implements MobileShop {

	@Override
	public void getModelNumber() {
		System.out.println("Blackbery 360");

	}

	@Override
	public void getPrice() {
		System.out.println("400");
	}

}
