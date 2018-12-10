package com.lind;

public class BubbleSort extends Sort {

	public BubbleSort() {
		super();
	}

	public void sort(int[] array, boolean optimize) {
		// printarray(array);
		int swaps = -1;
		int totalSwaps = 0, comparisons = 0;
		int o = 1;

		while (swaps != 0) {
			swaps = 0;
			for (int j = 0; j < array.length - o; j++) {
				comparisons++;
				if (array[j] > array[j + 1]) {
					swap(array, j, j + 1);
					swaps++;
					totalSwaps++;
				}
			}
			if (optimize) {
				o++;
			}

		}
		// printarray(array);
		System.out.println("BubbleSort");
		System.out.println("Swaps " + totalSwaps);
		System.out.println("Comparisons " + comparisons);
		System.out.println("Validation " + validateArray(array));

	}

	public void sort2(int[] array) {
		// //printarray(array);
		int totalSwaps = 0, comparisons = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - (i + 1); j++) {
				comparisons++;
				if (array[j] > array[j + 1]) {
					swap(array, j, j + 1);
					totalSwaps++;
				}
			}
		}

		//// printarray(array);
		System.out.println("BubbleSort");
		System.out.println("Swaps " + totalSwaps);
		System.out.println("Comparisons " + comparisons);
		System.out.println("Validation " + validateArray(array));
	}

	public void sort3(int[] array) {
		// //printarray(array);
		int totalSwaps = 0, comparisons = 0;
		int n = array.length;

		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				comparisons++;
				if (array[j - 1] > array[j]) {
					swap(array, j, j - 1);
					totalSwaps++;
				}
			}
		}

		//// printarray(array);
		System.out.println("BubbleSort");
		System.out.println("Swaps " + totalSwaps);
		System.out.println("Comparisons " + comparisons);
		System.out.println("Validation " + validateArray(array));
	}
}
