package com.structuraldesignpattern.adapter;

public class BicycleAdapter implements Vehicle {

	// composite
	private Bicycle bicycle;

	public BicycleAdapter(Bicycle bicycle) {
		super();
		this.bicycle = bicycle;
	}

	@Override
	public void accelerate() {
		bicycle.goByBus();
	}

}
