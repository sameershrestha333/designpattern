package com.structuraldesignpattern.adapter;

public class App {

	public static void main(String[] args) {
		Vehicle bus=new Bus();
		Vehicle car=new Car();
		Vehicle bicyble=new BicycleAdapter(new Bicycle());
		
		bus.accelerate();
		car.accelerate();
		bicyble.accelerate();
	}

}
