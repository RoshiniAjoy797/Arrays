package com.built_In.Errors;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryErrorExample {
	static class Dummy {
		double[] arr = new double[1_00_000];

	}

	public static void main(String[] args) {
//		List<int[]> list = new ArrayList<>();
//		while (true) {
//			list.add(new int[1_00_000]);
//		}
		/*
		 * The code is considered unreachable because of the two infinite loops in the
		 * main method. Once the first while(true) loop starts executing, it never
		 * exits, so the second while(true) loop that creates Dummy instances will never
		 * be reached.
		 */
		while (true) {
			new Dummy(); // endless object creation
		}
	}

}
