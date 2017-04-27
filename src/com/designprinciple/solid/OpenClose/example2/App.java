package com.designprinciple.solid.OpenClose.example2;

public class App {

	public static void main(String[] args) {
		SorterManager sorterManager=new SorterManager();
		sorterManager.sort(new QuickSort());
	
	}

}
