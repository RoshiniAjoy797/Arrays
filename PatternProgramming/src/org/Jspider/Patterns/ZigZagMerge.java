package org.Jspider.Patterns;

import java.util.Arrays;
import java.util.Scanner;

public class ZigZagMerge {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first array  ");
		System.out.print("No. of elements =   ");
		int n = sc.nextInt();
		int[] ar1 = new int[n];
		for(int i = 0; i < ar1.length;i++) {
			ar1[i] = sc.nextInt();
		}
		
		System.out.println("Enter second array : ");
		System.out.print("No. of elements =   ");
		int m = sc.nextInt();
		int[] ar2 = new int[m];
		for(int i = 0; i < ar2.length;i++) {
			ar2[i] = sc.nextInt();
		}
		
		int[] mergedArray = mergeZigZagArray(ar1, ar2);
		System.out.println("Merged Array in Zigzag Order: "
		+ Arrays.toString(mergedArray));
		

	}

	public static int[] mergeZigZagArray(int[] arr1, int[] arr2) {
		int len1 = arr1.length;
		int len2 = arr2.length;
		int[] zigzagArray = new int[len1 + len2];
		int maxLen = Math.max(len1, len2);
		int index = 0;
		for (int i = 0; i < maxLen; i++) {
			if(i < len1) {
				zigzagArray[index++] = arr1[i];
			}
			if(i < len2) {
				zigzagArray[index++] = arr2[i];
			}
		}
		return zigzagArray;

	}

}

