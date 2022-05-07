package com.dsa.sorting;

public abstract class AbstractSortAlgorithm {

	public static void swapNumbers(int[] array, int index1, int index2) {
		if (index1 == index2) {
			String err = "Invalid argument, input index can not be equal " + array[index1] + " != " + array[index2];
			System.err.println(err);
			return;
		}
		System.err.println("Replacing " + array[index1] + " with " + array[index2]);
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}
}
