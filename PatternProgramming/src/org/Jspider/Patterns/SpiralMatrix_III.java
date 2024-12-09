package org.Jspider.Patterns;

import java.util.Scanner;

public class SpiralMatrix_III {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Array size : ");
		int arsize = sc.nextInt();
		int[] ar = new int[arsize];
		System.out.println("Enter array elements : ");
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		System.out.print("Enter row : ");
		int row = sc.nextInt();
		System.out.print("Enter column: ");
		int column = sc.nextInt();
		System.out.println("Converting given array to 2d array ");
		int[][] result = construct2DArray(ar, row, column);
		disMat(result);

		System.out.print("Enter row index to start : ");
		int rStart = sc.nextInt();
		System.out.print("Enter column index to start : ");
		int cStart = sc.nextInt();
		if ((0 <= rStart && rStart <= row) && (0 <= cStart && cStart <= column)) {
			int[][] spiral = spiralMatrixIII(row, column, rStart, cStart);
			// Print the array in the desired format
			System.out.print("[");
			for (int i = 0; i < spiral.length; i++) {
				System.out.print("[" + spiral[i][0] + "," + spiral[i][1] + "]");
				if (i < spiral.length - 1) {
					System.out.print(","); // Add a comma except for the last element
				}
			}
		}
		System.out.println("]");
	}

	public static int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
		int[][] result = new int[rows * cols][2];
		int resultLength = result.length;
		int i = 0;
		result[i][0] = rStart;
		result[i][1] = cStart;
		i++;

		int moves = 0; // Tracks the number of steps in the current direction

		while (i < resultLength) {
			moves++;

			// Move right
			if (rStart < 0 || rStart >= rows) {
				cStart += moves;
			} else {
				for (int j = 0; j < moves; j++) {
					cStart++;
					//to prevent current column_index(cStart) is outside the boundaries of the grid
					if (cStart >= 0 && cStart < cols) {
						result[i][0] = rStart;
						result[i][1] = cStart;
						i++;
						if (i == resultLength)
							return result;
					}
				}
			}
			// Move down
			if (cStart < 0 || cStart >= cols) {
				rStart += moves;
			} else {
				for (int j = 0; j < moves; j++) {
					rStart++;
					//to check row_inde(rStart) is within the valid boundaries of the grid
					if (rStart >= 0 && rStart < rows) {
						result[i][0] = rStart;
						result[i][1] = cStart;
						i++;
						if (i == resultLength)
							return result;
					}
				}
			}

			moves++;
			// Move left
			if (rStart < 0 || rStart >= rows) {
				cStart -= moves;
			} else {
				for (int j = 0; j < moves; j++) {
					cStart--;
					if (cStart >= 0 && cStart < cols) {
						result[i][0] = rStart;
						result[i][1] = cStart;
						i++;
						if (i == resultLength)
							return result;
					}
				}
			}
			// Move up
			if (cStart < 0 || cStart >= cols) {
				rStart -= moves;
			} else {
				for (int j = 0; j < moves; j++) {
					rStart--;
					if (rStart >= 0 && rStart < rows) {
						result[i][0] = rStart;
						result[i][1] = cStart;
						i++;
						if (i == resultLength)
							return result;
					}
				}
			}
		}
		return result;
	}

	public static void disMat(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static int[][] construct2DArray(int[] original, int m, int n) {
		int len = original.length;
		if (len != m * n) {
			return new int[0][0];
		}
		int[][] convert = new int[m][n];
		int k = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				convert[i][j] = original[k];
				k++;
			}
		}
		return convert;
	}
}

/*
 Array size : 4
 Enter array elements :
1
2
3
4
Enter row : 1
Enter column: 4
Converting given array to 2d array 
1 2 3 4 
Enter row index to start : 0
Enter column index to start : 0
[[0,0],[0,1],[0,2],[0,3]]

*/
