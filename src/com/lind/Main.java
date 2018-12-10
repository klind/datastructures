package com.lind;

import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		BubbleSort bubbleSort = new BubbleSort();
		boolean optimize = true;

		int[] array = generateArray(100);

		bubbleSort.sort(Arrays.copyOf(array, array.length), optimize);
		bubbleSort.sort2(Arrays.copyOf(array, array.length));
		bubbleSort.sort3(Arrays.copyOf(array, array.length));
		System.out.println();
		InsertionSort insertionSort = new InsertionSort();
		insertionSort.sort(Arrays.copyOf(array, array.length));
		insertionSort.sort2(Arrays.copyOf(array, array.length));
		System.out.println();
		SelectionSort selectionSort = new SelectionSort();
		selectionSort.sort(Arrays.copyOf(array, array.length));
		System.out.println();
		QuickSort quickSort = new QuickSort();
		quickSort.sort(array, 0, array.length - 1);
	}

	private static int[] generateArray(int size) {
		Random random = new Random();
		int[] a = new int[size];
		for (int i = 0; i < size; i++) {
			a[i] = random.nextInt(100);
		}
		return a;
	}
}
