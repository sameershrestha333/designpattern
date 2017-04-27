package com.designprinciple.solid.liskovsubstitutionprinciple;

public class ElectricCar implements ElectricVehical {

	@Override
	public void speed() {
		System.out.println("Speed up the electric car...");

	}

	//we should not implement methods that we are not going to use and throw a new run time exception 
	@Override
	public void changeBattery() {
		System.out.println("Changing the battery...........");
	}

}
