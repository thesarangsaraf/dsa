package com.dsa.sorting;

import java.util.Arrays;

import com.dsa.core.rules.DsaExecutor;

public class BubbleSort extends AbstractSortAlgorithm implements DsaExecutor {

	@Override
	public void execute() {
		int[] numArray = { 321, 654, 6984, 1, 984, 651984, 61, 32132, 1641, 684, 1, 5, 456, 65, 3, 65, 651, 6, 65 };
		sort(numArray);
		System.out.println(Arrays.toString(numArray));
	}

	protected static void sort(int[] array) {
		for (int i = array.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (array[j] > array[j + 1]) {
					swapNumbers(array, j, j + 1);
				}
			}
		}
	}
}