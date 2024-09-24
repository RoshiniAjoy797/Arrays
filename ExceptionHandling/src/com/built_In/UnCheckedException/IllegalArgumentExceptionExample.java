package com.built_In.UnCheckedException;

public class IllegalArgumentExceptionExample {
	public static void main(String[] args) {
		Person1 p = new Person1();
		p.setAge(-10);
		System.out.println(p.getAge());
	}

}

class Person1 {
	private int age;

	public void setAge(int age) {
		
		if (age < 0) {
			throw new IllegalArgumentException("Age cannot be negative");
		}
		this.age = age;
	}

	public int getAge() {
		return age;
	} 
	
}
