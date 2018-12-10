package com.lind;

public class QuickSort extends Sort {

	public static int totalSwaps;
	public static int comparisons;

	public QuickSort() {
		super();
	}

	public void sort(int[] array, int start, int end) {
		//printarray(array);
		doSort(array, start, end);
		//printarray(array);
		System.out.println("QuickSort");
		System.out.println("Swaps " + totalSwaps);
		System.out.println("Comparisons " + comparisons);
		System.out.println("Validation " + validateArray(array));
	}

	private void doSort(int[] array, int start, int end) {
		// printarray(array);
		if (start < end) {
			int index = partition(array, start, end);
			doSort(array, start, /*index == 0 ? index : */index - 1);
			doSort(array, index + 1, end);
		}
	}

	private int partition(int[] array, int start, int end) {
		int pivot = array[end];
		//System.out.println("Pivot " + pivot);
		//printarray(array, start, end);
		int j = start - 1;
		for (int i = start; i < end; i++) {
			QuickSort.comparisons++;
			if (array[i] <= pivot) {
				j++;
				QuickSort.totalSwaps++;
				swap(array, j, i);
				//printarray(array, start, end);
			}
		}
		QuickSort.totalSwaps++;
		swap(array, j + 1, end);
		//printarray(array, start, end);
		return j + 1;

	}

}
