package com.org.SpecialNumbers;
import java.util.Scanner;

public class ValidPalindrome_I {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the sentence: "); 
		String s = sc.nextLine();
		boolean result = isPalindrome(s);
		System.out.println(result);
	}
	static boolean isPalindrome(String s) {
	        String ns = s.toLowerCase();
			String st = ""; // This will hold the final string without non-alphanumeric characters
			// Loop through each character in the input string
			for (int i = 0; i < ns.length(); i++) {
				char ch = ns.charAt(i); // Get the character at position i
				
				// Check if the character is a letter or a digit
				if ((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) {
					st = st + ch; // If it is, add it to the result string
				}
			}
			int i = 0;
			while (i < st.length() / 2) {
				if (st.charAt(i) != st.charAt(st.length() - 1 - i))
					return false;
				i++;
			}
			return true;

	 }
	 }

/*
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters 
 * and removing all non-alphanumeric characters, it reads the same forward and backward.
 * Alphanumeric characters include letters and numbers.
 * Given a string s, return true if it is a palindrome, or false otherwise.
		Example 1:
					Input: s = "A man, a plan, a canal: Panama"
					Output: true
					Explanation: "amanaplanacanalpanama" is a palindrome.
 */