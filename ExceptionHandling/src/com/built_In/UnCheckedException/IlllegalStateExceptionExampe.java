package com.built_In.UnCheckedException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IlllegalStateExceptionExampe {
	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			intList.add(i);
		}
		System.out.println(intList);
		Iterator<Integer> intListIter = intList.iterator();
		try {
			intListIter.remove();// Trying to remove before next() will throw an exception.
		} catch (IllegalStateException e) {// Correct exception to catch
			
			System.out.println("Trying to remove before next() will throw an exception.");
			//System.err.println("IllegalStateException caught!!");
			e.printStackTrace();
		}

	}

}
