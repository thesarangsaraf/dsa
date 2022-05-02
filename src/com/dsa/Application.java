package com.dsa;

import com.dsa.core.rules.DsaExecutor;
import com.dsa.sorting.BubbleSort;

public class Application {

	public static void main(String[] args) {
		
		DsaExecutor dsaExecutor = new BubbleSort();
		dsaExecutor.execute();
	}

}