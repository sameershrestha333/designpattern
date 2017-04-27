package com.designprinciple.solid.OpenClose.example1;

public class SorterManager {

	public void sort(Sorter sorter) {
		if (sorter.type == SortType.MERSESORT)
			doMerseSort(sorter);
		else if (sorter.type == SortType.INSERTIONSORT)
			doInsertionSort(sorter);

	}

	public void doMerseSort(Sorter sorter) {
		sorter.sort();
	}

	public void doInsertionSort(Sorter sorter) {
		sorter.sort();
	}
}
