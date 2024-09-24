package com.built_In.UnCheckedException;

import javafx.scene.control.SplitPane.Divider;

public class ArithmeticException {
	public static void main(String[] args) {
//		try {
//			int result = 30 / 0;
//		} catch (java.lang.ArithmeticException e) {
//			System.err.println("ArithmeticException caught!");
//			e.printStackTrace();
//		}
        int num = 100;
		int divisor = 0;
		if (divisor != 0) {
			int result = num/divisor;
			System.out.println(result);
		}else {
			System.out.println("Cannot divide by zero..");
		}
		
		try {
		    int result = num / divisor;
		    System.out.println(result);
		} catch (java.lang.ArithmeticException e) {
		    System.out.println("Arithmetic error: " + e.getMessage());
		}

	}

}
