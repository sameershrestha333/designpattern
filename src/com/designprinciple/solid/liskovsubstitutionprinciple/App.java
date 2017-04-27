package com.designprinciple.solid.liskovsubstitutionprinciple;

public class App {

	public static void main(String[] args) {

	//	ElectricVehical car = new ElectricCar();
		
		ElectricCar car = new ElectricCar();


		car.changeBattery();
	}

}
