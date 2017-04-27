package com.structuraldesignpattern.facade;

public class Samsung implements MobileShop {

	@Override
	public void getModelNumber() {
		System.out.println("Samsung galaxy 6");

	}

	@Override
	public void getPrice() {
		System.out.println("600");
	}

}
