package com.behavioraldesignpatterns.strategypattern;

public class App {

	public static void main(String[] args) {

		Manager manager=new Manager();
		manager.setStrategy(new Multiply());
		manager.operation(6, 3);
	}

}
