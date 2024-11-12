package org.Jspider.Patterns;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Flames {
	public static void main(String[] args) {
		Flames f = new Flames();
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Male name : ");
		String male = sc.nextLine();
		;
		System.out.print("Enter Female name : ");
		String female = sc.nextLine();

		Character[] s = diffCharacter(male, female);
		System.out.print("Different letters : ");
		for (int i = 0; i < s.length; i++) {
			if (i < s.length - 1)
				System.out.print(s[i] + ",");
			else
				System.out.println(s[i]);
		}
		int resultCount = count(s);
		System.out.print("Count of leters : " + resultCount);
		System.out.println();
		String result = findFlames(resultCount);
		System.out.print("Their relationship  is : " + result);
	}

	public static Character[] diffCharacter(String male, String female) {
		Set<Character> maleChars = new LinkedHashSet<>();
		Set<Character> femaleChars = new LinkedHashSet<>();
		for (int i = 0; i < male.length(); i++) {
			char ch = Character.toLowerCase(male.charAt(i));
			if (ch != ' ')
				maleChars.add(ch);
		}
		for (int i = 0; i < female.length(); i++) {
			char ch = Character.toLowerCase(female.charAt(i));
			if (ch != ' ')
				femaleChars.add(ch);
		}

		Set<Character> diffCharSet = new LinkedHashSet<>();
		for (char ch : maleChars) {
			if (!femaleChars.contains(ch)) {
				diffCharSet.add(ch);
			}
		}
		for (char ch : femaleChars) {
			if (!maleChars.contains(ch)) {
				diffCharSet.add(ch);
			}
		}

		Character[] c = new Character[diffCharSet.size()];
		int i = 0;
		for (Character ele : diffCharSet) {
			c[i] = ele;
			i++;
		}

		return c;
	}

	public static int count(Character[] blend) {
		char count = 0;
		for (int i = 0; i < blend.length; i++) {
			count++;
		}
		return count;
	}

	public static String findFlames(int count) {
		switch (count % 6) {
		case 1:
			return "Friends";
		case 2:
			return "Love";
		case 3:
			return "Affection";
		case 4:
			return "Marriage";
		case 5:
			return "Enemy";
		case 0:
			return "Siblings"; // If num % 6 == 0, it maps to Siblings
		default:
			return "Invalid number";
		}

	}

}
