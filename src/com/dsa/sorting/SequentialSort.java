package com.dsa.sorting;

import java.util.Arrays;

import com.dsa.core.rules.DsaExecutor;

public class SequentialSort extends AbstractSortAlgorithm implements DsaExecutor {

	@Override
	public void execute() {
		int[] numArray = { 50, 80, 70, 10 };
		sort(numArray);
		System.out.println(Arrays.toString(numArray));
	}

	protected static void sort(int[] array) {
		for (int i = array.length - 1; i > 0; i--) {

			int largestIndex = 0;

			for (int j = 1; j <= i; j++) {
				if (array[largestIndex] < array[j]) {
					largestIndex = j;
				}
			}
			swapNumbers(array, largestIndex, i);
		}
	}
}