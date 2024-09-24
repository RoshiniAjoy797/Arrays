package com.built_In.UnCheckedException;

public class StringIndexOutOfBoundsException {
	public static void main(String[] args) {
		String str = "Hello world";
		try {
			char charAtnegativeIndex = str.charAt(-1);
			char charAtLengthIndex = str.charAt(11);
		} catch (java.lang.StringIndexOutOfBoundsException e) {
			System.err.println("StringIndexOutOfBoundsException caught");
			e.printStackTrace();
		}
	}

}
