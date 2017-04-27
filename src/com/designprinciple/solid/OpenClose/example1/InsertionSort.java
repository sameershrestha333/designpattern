package com.designprinciple.solid.OpenClose.example1;

public class InsertionSort extends Sorter {

	public InsertionSort() {
		super.type=SortType.INSERTIONSORT;
	}
	@Override
	public void sort(){
		System.out.println("This is insertion sort.");
	}
	
}
