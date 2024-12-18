package com.org.SpecialNumbers;
import java.util.Scanner;

public class ValidPalindrome_II {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the sentence: ");
		String s = sc.nextLine();
		boolean result = isPalindrome(s);
		System.out.println(result);
	}

	public static boolean isPalindrome(String s) {
		int left = 0;
		int right = s.length() - 1;

		while (left < right) {
			if (s.charAt(left) != s.charAt(right)) {
				// Try skipping either left or right character
				return validPalindrome(s, left + 1, right) || validPalindrome(s, left, right - 1);
			}
			left++;
			right--;
		}
		return true; // If no mismatch found, it's already a palindrome
	}

	private static boolean validPalindrome(String s, int left, int right) {
		while (left < right) {
			if (s.charAt(left) != s.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
}
/* 
 * return true if the string can be palindrome after deleting at most one character from it.
 	Example:
 			Input: s = "abca"
			Output: true
			Explanation: You could delete the character 'c'
 */
 