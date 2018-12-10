package com.lind;

public class SelectionSort extends Sort {

	public SelectionSort() {
		super();
	}

	public void sort(int[] array) {
		//printarray(array);
		int totalSwaps = 0, comparisons = 0;

		int length = array.length;

		for (int i = 0; i < length; i++) {
			int index = i;
			for (int j = i; j < length; j++) {
				comparisons++;
				if (array[j] < array[index]) {
					index = j;
				}
			}
			if (index > i) {
				totalSwaps++;
				swap(array, i, index);
			}
		}

		//printarray(array);
		System.out.println("SelectionSort");
		System.out.println("Swaps " + totalSwaps);
		System.out.println("Comparisons " + comparisons);
		System.out.println("Validation " + validateArray(array));
	}
}
