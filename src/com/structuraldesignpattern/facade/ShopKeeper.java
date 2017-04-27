package com.structuraldesignpattern.facade;

public class ShopKeeper {
	private MobileShop iphone;
	private MobileShop samsung;
	private MobileShop blackbery;

	public ShopKeeper() {
		iphone = new Iphone();
		samsung = new Samsung();
		blackbery = new Blackbery();
	}

	public void getIphoneSale() {
		iphone.getModelNumber();
		iphone.getPrice();
	}

	public void getSamsungSale() {
		samsung.getModelNumber();
		samsung.getPrice();
	}

	public void getIBlackberySale() {
		blackbery.getModelNumber();
		blackbery.getPrice();
	}

}
