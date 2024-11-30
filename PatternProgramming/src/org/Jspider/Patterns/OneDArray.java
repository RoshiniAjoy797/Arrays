package org.Jspider.Patterns;

import java.util.Scanner;

public class OneDArray {
	public static void main(String[] args) {
		OneDArray p = new OneDArray();
		int[] arr = p.readArray();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter new element : ");
		int ele = sc.nextInt();

		System.out.println("Enter index to place " + ele);
		int index = sc.nextInt();
		arr = p.insert(arr, ele, index);
		p.dispArray(arr);

		System.out.println();
		System.out.println("Enter index to delete : ");
		int ind = sc.nextInt();
		arr = p.delete(arr, ind);
		p.dispArray(arr);

		sc.close();
		System.out.println();
		int[] eo = p.countEvenOdd(arr);
		p.dispArray(eo);

		System.out.println();
		int smallEle = p.smallEle(arr);
		System.out.println("Smallest Element is--> " + smallEle);

		int bigEle = p.biggestELe(arr);
		System.out.println("Biggest  Element is--> " + bigEle);

		int ra[] = p.reverseArray(arr);
		System.out.print("reversed array : ");
		p.dispArray(ra);
		System.out.println();
		int cp = p.getPosEle(arr);
		System.out.println("Positive element is " + cp);
		int cn = p.getNegEle(arr);
		System.out.println("Negative element is " + cn);

		int[] ft = p.findTwoLargest(arr);
		System.out.println("First two largest nums are : " + ft[0] + ", " + ft[1]);
		
		int[] S = p.findSmallestLargest(arr);
		System.out.println("First two smallest nums are : " + S[0] + ", " + S[1]);
	}

	int[] reverseArray(int[] arr) {

		for (int i = 0; i < arr.length / 2; i++) {
			int t = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = t;
		}
		return arr;
	}

	int smallEle(int[] arr) {
		int small = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < small) {
				small = arr[i];

			}
		}
		return small;
	}

	int biggestELe(int[] arr) {
		int big = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > big) {
				big = arr[i];
			}
		}
		return big;
	}

	void dispArray(int[] ele) {
		for (int i = 0; i < ele.length; i++) {
			System.out.print(ele[i]);
			if (i < ele.length - 1) {
				System.out.print(", ");
			}
		}
	}

	int[] countEvenOdd(int[] a) {
		int count[] = new int[2];
		System.out.println("Even and odd values are ----- ");
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				count[0]++;
			} else
				count[1]++;
		}
		return count;
	}

	int[] readArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array -- ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter " + n + " elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;
	}

	public int getPosEle(int[] arr) {
		int countp = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				countp++;
			}
		}

		return countp;
	}

	public int getNegEle(int[] arr) {
		int countn = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				countn++;
			}
		}

		return countn;
	}

	int[] insert(int[] arr, int ele, int index) {
		if (index < 0 || index > arr.length) {
			System.out.println("Index is not in range ..");
			return arr;
		}

		int[] na = new int[arr.length + 1];
		na[index] = ele;
		for (int i = 0; i < arr.length; i++) {
			if (i < index) {
				na[i] = arr[i];
			} else
				na[i + 1] = arr[i];
		}

		return na;
	}

	int[] delete(int arr[], int index) {

		if (index < 0 || index > arr.length) {
			System.out.println("Index is not in range ..");

			return arr;
		}
		int[] na = new int[arr.length - 1];
		for (int i = 0; i < na.length; i++) {
			if (i < index) {
				na[i] = arr[i];
			} else {
				na[i] = arr[i + 1];
			}
		}

		return na;

	}

	public int[] findTwoLargest(int[] arr) {
		int h1 = arr[0];
		int h2 = arr[1];
		for (int i = 0; i < arr.length; i++) {
			if (h1 < arr[i]) {
				h2 = h1;
				h1 = arr[i];
			} else if (arr[i] > h2 && h1 != arr[i]) {
				h2 = arr[i];
			}
		}

		return new int[] { h1, h2 };
	}
	
	public int[] findSmallestLargest(int[] arr) {
		int h1 = arr[0];
		int h2 = arr[1];
		for (int i = 0; i < arr.length; i++) {
			if (h1 > arr[i]) {
				h2 = h1;
				h1 = arr[i];
			} else if (arr[i] < h2 && h1 != arr[i]) {
				h2 = arr[i];
			}
		}

		return new int[] { h1, h2 };
	}

}