/*
 * A perfect number is a positive integer that is equal
 *  to the sum of its positive divisors, excluding the number itself.
 *  
 */
package com.org.SpecialNumbers;
import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num : ");
		int n = sc.nextInt();
		boolean result = isPerfectNumber(n);
		System.out.println(result);
	}

	public static boolean isPerfectNumber(int num) {
		if (num <= 1) {
			return false; // 1 or less cannot be a perfect number
		}
		int sum = 1; // assuming 1 is a divisor of all numbers
		/*
		 * to find all the proper divisors of n (excluding n).improving performance by
		 * skipping unnecessary checks for divisors larger than n / 2
		 */
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0)
				sum = sum + i; // i is a divisor, it gets added to sum
		}
		return sum == num;
	}
}
