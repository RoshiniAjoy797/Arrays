/*
 * An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.
 * Given an integer n, return the nth ugly number.
 * 
 */
package com.org.SpecialNumbers;
import java.util.Scanner;

public class UglyNumber_II {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num : ");
		int n = sc.nextInt();
		int result = nthUglyNumber(n);
		System.out.println("First " + n + "th ugly numbers :  " + result);
	}

	// Optimized method to find the nth ugly number
	public static int nthUglyNumber(int n) {
		int[] ugly = new int[n];
		ugly[0] = 1; // The first ugly number is always 1

		int i2 = 0, i3 = 0, i5 = 0; // Pointers for the next multiples of 2, 3, and 5
		int next2 = 2, next3 = 3, next5 = 5; // Next multiples of 2, 3, and 5

		for (int i = 1; i < n; i++) {
			// Find the next ugly number
			int nextUgly = Math.min(next2, Math.min(next3, next5));
			ugly[i] = nextUgly;

			// Update the next multiples and pointers
			if (nextUgly == next2) {
				i2++;
				next2 = ugly[i2] * 2;
			}
			if (nextUgly == next3) {
				i3++;
				next3 = ugly[i3] * 3;
			}
			if (nextUgly == next5) {
				i5++;
				next5 = ugly[i5] * 5;
			}
		}

		// Return the nth ugly number
		return ugly[n - 1];

	}
}
