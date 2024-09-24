
public class MultipleCatchException {
	public static void main(String[] args) {
		try {
			int[] numbers = { 1, 2, 3 };
			System.out.println(numbers[12]);
			int result = 10 / 0;
			System.out.println(result);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of bounds: " + e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic error :" + e.getMessage());
		} finally {
			System.out.println("Finally block executed.");
		}

	}
}
