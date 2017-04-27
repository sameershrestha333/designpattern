package com.behavioraldesignpatterns.templatepattern;

public class InsertionSort extends Algorithm {

	private int[] numbers;

	public InsertionSort(int[] numbers) {
		super();
		this.numbers = numbers;
	}

	@Override
	public void initialize() {
		System.out.println("Initialzing the insertion sort.");
	}

	@Override
	public void sorting() {

		int temp;
		int j;
		for (int i = 1; i < this.numbers.length; i++) {
			temp = this.numbers[i];
			j = i;
			while (j > 0 && numbers[j - 1] > temp) {
				numbers[j] = numbers[j - 1];
				j = j - 1;
			} // end of while
			numbers[j] = temp;
		} // end of for
	}

	@Override
	public void printResult() {
		for (int i = 0; i < numbers.length; i++)
			System.out.print(numbers[i] + " ");
	}

}
