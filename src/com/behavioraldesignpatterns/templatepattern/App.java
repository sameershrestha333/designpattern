package com.behavioraldesignpatterns.templatepattern;

public class App {

	public static void main(String[] args) {

		int[] numbers={1,5,3,8,2,-2,10};
		Algorithm sortAlogrith=new InsertionSort(numbers);
		sortAlogrith.sort();
	}

}
