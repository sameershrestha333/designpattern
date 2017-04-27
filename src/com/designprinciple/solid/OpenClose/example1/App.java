package com.designprinciple.solid.OpenClose.example1;

public class App {

	public static void main(String[] args) {
		SorterManager sorterManager=new SorterManager();
		sorterManager.sort(new MergeSort());
	
	}

}
