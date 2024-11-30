package org.Jspider.Patterns;

import java.util.Scanner;

public class RotateAndTranspose {

	private static int[][] reverseDiagonal(int[][] arr) {
		for (int i = 0; i < arr.length / 2; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i == j) {
					int t = arr[i][j];
					arr[i][j] = arr[arr.length - 1 - i][arr.length - 1 - j];
					arr[arr.length - 1 - i][arr.length - 1 - j] = t;
				}
				if (i + j == arr.length - 1) {
					int t = arr[i][j];
					arr[i][j] = arr[j][i];
					arr[j][i] = t;
				}
			}
		}
		return arr;
	}

	public static int[][] rotate(int[][] matrix) {
		int[][] result = new int[matrix[0].length][matrix.length];

		for (int i = 0; i < matrix[0].length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				result[i][j] = matrix[matrix.length - 1 - j][i];
			}
		}
		return result;
	}

	/*
	 * For transpose, if square matrix(2x2,3x3) below is fine. but for non-square
	 * matrix need to create new 2d array..
	 * 
	 */
	static int[][] transpose(int arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				int t = arr[j][i];
				arr[j][i] = arr[i][j];
				arr[i][j] = t;
			}
		}
		return arr;
	}

	static int[][] rotate90left(int arr[][]) {
		for (int i = 0; i < arr.length / 2; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				int t = arr[i][j];
				arr[i][j] = arr[arr.length - 1 - i][j];
				arr[arr.length - 1 - i][j] = t;
			}
		}
		return arr;
	}

	static int[][] rotate90right(int ar[][]) {
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[0].length / 2; j++) {
				int t = ar[i][j];
				ar[i][j] = ar[i][ar[0].length - 1 - j];
				ar[i][ar[0].length - 1 - j] = t;
			}
		}
		return ar;
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

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array dimension :  ");
		int row = sc.nextInt();
		int column = sc.nextInt();
		System.out.println("enter the elements");
		int arr[][] = new int[row][column];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Original matrix : ");
		disMat(arr);

		System.out.println("Reverse Diagonal");
		int[][] diagonal = reverseDiagonal(arr);
		disMat(diagonal);

		System.out.println("Transpose matrix : ");
		int[][] trans = transpose(arr);
		disMat(trans);

		System.out.println("rotate 90° right(Clockwise) Matrix");
		int[][] right = rotate90right(trans);
		disMat(right);

		System.out.println("rotate 90° left(Anti-Clockwise) Matrix");
		int[][] left = rotate90left(trans);
		disMat(left);

		System.out.println("rotate Matrix");
		int[][] rotate = rotate(arr);
		disMat(rotate);

	}

}
