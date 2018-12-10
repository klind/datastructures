package com.lind;

public class InsertionSort extends Sort {

	public InsertionSort() {
		super();
	}

	public void sort(int[] array) {
		//printarray(array);
		int totalSwaps = 0, comparisons = 0;
		for (int i = 1; i < array.length; i++) {
			comparisons++;
			if (array[i] < array[i - 1]) {
				swap(array, i, i - 1);
				totalSwaps++;
				for (int j = i - 1; j > 0; j--) {
					comparisons++;
					if (array[j] < array[j - 1]) {
						swap(array, j, j - 1);
						totalSwaps++;
					}
				}

			}
		}
		//printarray(array);
		System.out.println("InsertionSort");
		System.out.println("Swaps " + totalSwaps);
		System.out.println("Comparisons " + comparisons);
		System.out.println("Validation " + validateArray(array));
	}
	
	public void sort2(int[] array) {
		//printarray(array);
		int totalSwaps = 0, comparisons = 0;
		for (int i = 1; i < array.length; i++) {
			for (int j = i; j > 0; j--) {
				comparisons++;
				if (array[j] < array[j-1]) {
					swap(array, j, j - 1);
					totalSwaps++;
				}
			}
		}
		//printarray(array);
		System.out.println("InsertionSort");
		System.out.println("Swaps " + totalSwaps);
		System.out.println("Comparisons " + comparisons);
		System.out.println("Validation " + validateArray(array));
	}
	
}
