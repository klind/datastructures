package com.lind;

public class Sort {

	protected void printarray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();

	}

	protected void swap(int[] array, int i, int j) {
		//System.out.println("Swapping " + array[i] + " and " + array[j]);
		int t = array[i];
		array[i] = array[j];
		array[j] = t;

	}

	protected boolean validateArray(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] > array[i + 1]) {
				return false;

			}
		}
		return true;
	}

	protected void printarray(int[] array, int start, int end) {
		for (int i = start; i <= end; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();

	}
}
