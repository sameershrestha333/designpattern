package com.designprinciple.solid.OpenClose.example1;

public class MergeSort extends Sorter {

	public MergeSort() {
		super.type=SortType.MERSESORT;
	}
	@Override
	public void sort(){
		System.out.println("This is merge sort.");
	}
	
}
