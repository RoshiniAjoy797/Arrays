package org.Jspider.Patterns;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SpiralMatrix_I {
	static List<Integer> spiralOrder(int[][] ar) {
		int rows = ar.length; // Number of rows
		int cols = ar[0].length; // Number of columns
		List<Integer> spiral = new ArrayList<>();

		// Adjusted the loop conditions to work for any matrix dimensions
		for (int i = 0, j = Math.min(rows, cols) - 1; i <= j; i++, j--) {

			// Traverse from left to right
			for (int k = i; k < cols - i; k++) {
				spiral.add(ar[i][k]);
			}
			// Traverse from top to bottom
			for (int k = i + 1; k < rows - i; k++) {
				spiral.add(ar[k][cols - i - 1]);
			}
			// Traverse from right to left
			if (i < rows - i - 1) {
				for (int k = cols - i - 2; k >= i; k--) {
					spiral.add(ar[rows - i - 1][k]);
				}
			}
			// Traverse from bottom to top
			if (i < cols - i - 1) {
				for (int k = rows - i - 2; k > i; k--) {
					spiral.add(ar[k][i]);
				}
			}
		}
		return spiral;
	}

	static void disMat(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		SpiralMatrix_I s = new SpiralMatrix_I();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array dimension");
		int row = sc.nextInt();
		int column = sc.nextInt();
		System.out.println("enter the elements");
		int ar[][] = new int[row][column];
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				ar[i][j] = sc.nextInt();
			}
		}
		System.out.println("Original matrix : ");
		disMat(ar);

		System.out.println("Spiral matrix order : ");
		List<Integer> result = spiralOrder(ar);
		System.out.println(result);
	}
}
/*
 * Input matrix = [[1,2,3],[4,5,6],[7,8,9]] Output = [1,2,3,6,9,8,7,4,5]
 * Expected = [1,2,3,6,9,8,7,4,5]
 * ___________________________________________________ Input matrix =
 * [[1,2,3,4],[5,6,7,8],[9,10,11,12]] Output = [1,2,3,4,8,12,11,10,9,5,6,7]
 * Expected = [1,2,3,4,8,12,11,10,9,5,6,7]
 * 
 */