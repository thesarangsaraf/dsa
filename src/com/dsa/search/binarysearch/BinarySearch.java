package com.dsa.search.binarysearch;

import com.dsa.core.rules.DsaExecutor;

public class BinarySearch implements DsaExecutor {

	@Override
	public void execute() {
		int[] numArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		int searchTarget = 15;

		int valueIndex = binarySearch(numArray, searchTarget);
		System.out.println(valueIndex);
	}

	protected static int binarySearch(int[] numArray, int target) {
		int left = 0, mid = 0;
		int right = numArray.length - 1;

		while (left < right) {
			mid = (left + right) / 2;
			if (numArray[mid] == target) {
				return mid;
			} else if (numArray[mid] < target) {
				left = mid;
			} else if (numArray[mid] > target) {
				right = mid;
			}
		}
		return -1;
	}
}