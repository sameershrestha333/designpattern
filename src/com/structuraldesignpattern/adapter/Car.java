package com.structuraldesignpattern.adapter;

public class Car implements Vehicle {

	@Override
	public void accelerate() {
		System.out.println("Car is accelerating.....");
	}

}
