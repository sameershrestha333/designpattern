package com.structuraldesignpattern.facade;

public class Iphone implements MobileShop {

	@Override
	public void getModelNumber() {
		System.out.println("Iphone 6");

	}

	@Override
	public void getPrice() {
		System.out.println("800");
	}

}
