package org.Jspider.Patterns;

import java.io.ObjectOutput;
import java.util.Scanner;

public class TwoDArray {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter row : ");
//		int row = sc.nextInt();
//		System.out.print("Enter column : ");
//		int column = sc.nextInt();
//
//		System.out.println("Enter the elements : ");
//		int arr[][] = new int[row][column];
//		int r = arr.length;
//		for (int i = 0; i < r; i++) {
//			int c = arr[i].length;
//			for (int j = 0; j < c; j++) {
//				arr[i][j] = sc.nextInt();
//			}
//		}
//		System.out.println("Matrix : ");
//		for (int i = 0; i < row; i++) {
//			for (int j = 0; j < column; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
//
//		System.out.println("Row reverse : ");
//		reverseRow(arr);
//
//		System.out.println("Column reverse : ");
//		reverseColumn(arr);
//
//	}
//
//	static void reverseColumn(int[][] arr) {
//		for (int i = 0; i < arr.length / 2; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				int t = arr[i][j];
//				arr[i][j] = arr[arr.length - 1 - i][j];
//				arr[arr.length - 1 - i][j] = t;
//			}
//		}
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
//
//	}
//
//	static void reverseRow(int[][] arr) {
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length / 2; j++) {
//				int t = arr[i][j];
//				arr[i][j] = arr[i][arr[i].length - 1 - j];
//				arr[i][arr[i].length - 1 - j] = t;
//			}
//		}
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
//	}

	public static void main(String[] args) {
		TwoDArray tda = new TwoDArray();

		System.out.println("Enter first matrix  ");
		int[][] matrix1 = tda.readMatrix();
		System.out.println("First matrix is : ");
		tda.disMat(matrix1);

		System.out.println("Enter second matrix  ");
		int[][] matrix2 = tda.readMatrix();
		System.out.println("Second matrix is : ");
		tda.disMat(matrix2);

		System.out.println("Sum of matrix :");
		int result[][] = tda.sumMatrix(matrix1, matrix2);
		if (result != null) {
			tda.disMat(result);
		} else {
			System.out.println("Skipping sum due to incompatible dimensions.");
		}

		System.out.println("Product of matrix :");
		int res[][] = tda.prodMatrix(matrix1, matrix2);
		if (res != null) {
			tda.disMat(res);
		} else {
			System.out.println("Multiplication cannot be done due to incompatible dimensions.");
		}

	}

	int[][] prodMatrix(int[][] m1, int[][] m2) {
		if (m1[0].length != m2.length) {
			System.out.println("Matrices dimensions must match for multiplication."
					+ " column of first matrix is equal to row of second matrix.. ");
			return null;
		}
		int[][] sm = new int[m1.length][m2[0].length];
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m2[0].length; j++) {
				for (int k = 0; k < m2.length; k++) {
					sm[i][j] = sm[i][j] + m1[i][k] * m2[k][j];
				}
			}
		}

		return sm;

	}

	int[][] sumMatrix(int[][] m1, int[][] m2) {
		if (m1[0].length != m2[0].length || m1.length != m2.length) {
			System.out.println("Matrices dimensions must match for addition." 
		+ "Sum of matrix - Matrix should be m*n + m*n");

			return null;
		} else {
			int[][] sm = new int[m1.length][m1[0].length];
			for (int i = 0; i < m1.length; i++) {
				for (int j = 0; j < m2[0].length; j++) {
					sm[i][j] = m1[i][j] + m2[i][j];
				}
			}

			return sm;
		}
	}

	private void disMat(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	private int[][] readMatrix() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row : ");
		int row = sc.nextInt();
		System.out.print("Enter column : ");
		int column = sc.nextInt();
		System.out.println("Enter the elements : ");
		int[][] matrix = new int[row][column];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		return matrix;
	}

}
