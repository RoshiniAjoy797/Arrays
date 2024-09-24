
public class CustomExceptionExample {
	public static void main(String[] args) {
		try {
			validateAge(45);
		} catch (InvalidAgeException e) {
			System.out.println("caught custom excetion : " + e.getMessage());
		}
	}

	public static void validateAge(int age) throws InvalidAgeException {
		if (age < 18) {
			throw new InvalidAgeException("Age must be 18 or older.");
		}
		System.out.println("Age is valid.");
	}
}
/*
 * throw: used to explicitly throw an exception
 * throws: used to declare that a method may throw exceptions, which must be 
 * handled by the caller.
 */

