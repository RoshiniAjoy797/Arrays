package com.built_In.UnCheckedException;

public class ArrayIndexOutOfBoundsException {
	public static void main(String[] args) {
		// Accessing Negative Index
		int[] array = { 1, 2, 3, 4, 5 };
		System.out.println(array[-1]);

		// off-by-one Error in loop
		int[] numbers = { 10, 20, 30, 40 };
		for (int i = 0; i <= numbers.length; i++) {
			System.out.println(numbers[i]);
		}

		// Multidimensional Arrays
		int[][] matrix = { 
				{ 1, 2, 3 }, 
				{ 4, 5, 6 },
				{ 7, 8, 9 } 
			};
		System.out.println(matrix[3][3]);
		
		//Array length zero
		int[] emptyArray = new int[0];
		System.out.println(emptyArray[0]);

	}
}
