package com.dsa;

import com.dsa.core.rules.DsaExecutor;
import com.dsa.sorting.SequentialSort;

public class DsaApplication {

	public static void main(String[] args) {
		
		DsaExecutor dsaExecutor = new SequentialSort();
		dsaExecutor.execute();
	}

}