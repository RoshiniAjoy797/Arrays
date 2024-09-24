package com.built_In.UnCheckedException;

public class NullPointerExceptionExample {
	public static void main(String[] args) {
		
		Person person = null;
		try {
			 String name = person.personName; // Accessing the field of a null object
	            person.personName = "Ramesh";
		}catch( java.lang.NullPointerException e) {
			System.out.println(" Null pointer exception caught!");
			e.printStackTrace();
		}
	}

}

class Person {
	public String personName;

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getPersonName() {
		return personName;
	}
}
