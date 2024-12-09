package org.Jspider.Patterns;

import java.util.Scanner;

public class SpiralMatrix_IV {
	// Definition of ListNode
	static class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Input for matrix dimensions
		System.out.print("Enter the number of rows (m): ");
		int m = sc.nextInt();
		System.out.print("Enter the number of columns (n): ");
		int n = sc.nextInt();

		// Input for creating the linked list
		System.out.print("Enter the number of elements in the linked list: ");
		int numElements = sc.nextInt();

		ListNode head = null;
		ListNode current = null;

		// Taking input for the linked list elements
		System.out.println("Enter the elements of the linked list:");
		for (int i = 0; i < numElements; i++) {
			int val = sc.nextInt();
			if (head == null) {
				head = new ListNode(val);
				current = head;
			} else {
				current.next = new ListNode(val);
				current = current.next;
			}
		}

		// Instantiate the solution and call spiralMatrix
		SpiralMatrix_IV gsm = new SpiralMatrix_IV();
		int[][] result = gsm.spiralMatrix(m, n, head);
		System.out.println("Spiral matrix : ");
		disMat(result);
		sc.close();
	}

	public int[][] spiralMatrix(int m, int n, ListNode head) {
		int[][] sm = new int[m][n];
		for (int i = 0; i < sm.length; i++) {
			for (int j = 0; j < sm[0].length; j++) {
				sm[i][j] = -1;
			}
		}
		ListNode current = head;
		// Adjusted the loop conditions to work for any matrix dimensions

		for (int i = 0, j = Math.min(m, n) - 1; i <= j; i++, j--) {

			// Traverse from left to right
			for (int k = i; k < n - i; k++) {
				if (current != null) {
					sm[i][k] = current.val;
					current = current.next;
				}
			}
			// Traverse from top to bottom
			for (int k = i + 1; k < m - i; k++) {
				if (current != null) {
					sm[k][n - i - 1] = current.val;
					current = current.next;
				}
			}
			// Traverse from right to left
			if (i < m - i - 1) {
				for (int k = n - i - 2; k >= i; k--) {
					if (current == null)
						break;
					sm[m - i - 1][k] = current.val;
					current = current.next;
				}
			}
			// Traverse from bottom to top
			if (i < n - i - 1) {
				for (int k = m - i - 2; k > i; k--) {
					if (current == null)
						break;
					sm[k][i] = current.val;
					current = current.next;
				}
			}
		}
		return sm;

	}

	static void disMat(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}

/*
 * 
 * Input n = 3 
 * Output = [[1,2,3],[8,9,4],[7,6,5]] 
 * Expected = [[1,2,3],[8,9,4],[7,6,5]]
 * 
 * 
 */
