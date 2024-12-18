/*
 * Starting with any positive integer, replace the number by the sum 
 * of the squares of its digits. Repeat the process until the number equals 1 
 * (where it will remain), in which case it is a happy number.
 * 
 * */
package com.org.SpecialNumbers;

import java.util.Scanner;
public class HappyNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num : ");
		int n = sc.nextInt();
		boolean result = isHappy(n);
		System.out.println(result);
	}

	public static boolean isHappy(int n) {
		/*
		 * runs as long as n has more than one digit. It repeatedly calculates the sum
		 * of the squares of the digits of n until it reduces to a single-digit number.
		 * 
		 */
		while (n > 9) {
			int sum = 0;
			while (n != 0)// inner loop
			{
				int r = n % 10; // Extracts the last digit using
				sum = sum + r * r; // Squares that last digit and adds it to sum
				n = n / 10; // Removes the last digit from n
			}
			n = sum; // sum contains the sum of the squares of the digits of n
		}
		return n == 1 || n == 7;
		/*
		 * If the process of summing the squares of digits leads to 1, the number is a
		 * happy number. Single-digit numbers that are part of the happy number chain
		 * also include 7. For example, starting from 7 eventually leads to 1.
		 */

	}
}
