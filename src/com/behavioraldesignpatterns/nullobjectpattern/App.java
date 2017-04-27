package com.behavioraldesignpatterns.nullobjectpattern;

public class App {

	public App() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		CustomerFactory customerFactory=new CustomerFactory();
		System.out.println(customerFactory.getCustomer("Joe1").getCustomer());
	}

}
