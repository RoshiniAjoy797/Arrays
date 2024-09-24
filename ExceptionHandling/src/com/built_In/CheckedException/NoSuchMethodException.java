package com.built_In.CheckedException;

import java.lang.reflect.Method;

public class NoSuchMethodException {

	public static void main(String[] args) {
		MyClass obj = new MyClass();
		try {
			Method method = obj.getClass().getMethod("NonExistentMethod");
			method.invoke(obj);
		} catch (java.lang.NoSuchMethodException e) {
			e.printStackTrace();
			System.err.println("The method you're trying to access doesn't exist: " + e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

class MyClass {
	public void myMethod() {
		System.out.println("This is my method!!");
	}
}
