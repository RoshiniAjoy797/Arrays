/*
https://leetcode.com/problems/spiral-matrix-ii/
*/

package org.Jspider.Patterns;
import java.util.Scanner;

public class GenerateSpiralMatrix {
	public static void main(String[] args) {
		SpiralOrderMatrix s = new SpiralOrderMatrix();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter positive integer : ");
		int n = sc.nextInt();
		int[][] matrix = generateMatrix(n);
		System.out.println("Generated spiral matrix : ");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static int[][] generateMatrix(int n) {
		int[][] gm = new int[n][n];
		int ele = 1;
		if (ele <= n * n) {
			for (int i = 0, j = n - 1; i <= j; i++, j--) {

				// Traverse from left to right
				for (int k = i; k < n - i; k++) {
					gm[i][k] = ele;
					ele++;
				}
				// Traverse from top to bottom
				for (int k = i + 1; k < n - i; k++) {
					gm[k][n - i - 1] = ele;
					ele ++;
				}
				// Traverse from right to left
				if (i < n - i - 1) {
					for (int k = n - i - 2; k >= i; k--) {
						gm[n - i - 1][k] = ele ;
						ele++;
					}
				}
				// Traverse from bottom to top
				if (i < n - i - 1) {
					for (int k = n - i - 2; k > i; k--) {
						gm[k][i] = ele;
						ele++;
					}
				}
			}
		}
		return gm;
	}
}
