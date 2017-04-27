package com.creational.designpattern.factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.xml.bind.ParseConversionEvent;

public class GenerateBill {
	public static void main(String[] args) throws IOException {
		
		

		PlanFactory planFactory = new PlanFactory();
		System.out.println("Enter the name of plan for which the bill will be generated:");
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));

		String inputName = bReader.readLine();

		System.out.println("Now,enter the number of units for bill will be calculated: ");
		int units =Integer.parseInt(bReader.readLine());
		
		Plan plan=planFactory.getPlan(inputName);
		System.out.println("Bill for :"+inputName +"with Units : "+units);
		plan.getRate();
		plan.calculateBill(units);
	}
}
