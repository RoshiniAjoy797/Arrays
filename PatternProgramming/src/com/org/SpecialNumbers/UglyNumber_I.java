/*
 * An ugly number is a positive integer which does not have 
 * a prime factor other than 2, 3, and 5.
 * 
 */
package com.org.SpecialNumbers;

import java.util.Scanner;
public class UglyNumber_I {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num : ");
		int n = sc.nextInt();
		boolean result = isUgly(n);
		System.out.println(result);
	}

	public static boolean isUgly(int n) {
		if (n <= 0)
			return false;// Ugly numbers must be positive
		while (n % 2 == 0)
			n = n / 2; // Divide by 2 until not divisible
		while (n % 3 == 0)
			n = n / 3; // Divide by 3 until not divisible
		while (n % 5 == 0)
			n = n / 5; // Divide by 5 until not divisible
		return n == 1;
	}
}
