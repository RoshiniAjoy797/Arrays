
public class ChainedExceptionDemo {
	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void method1() throws Exception {
		try {
			method2();
		} catch (Exception e) {
			throw new Exception("Exception in method 1" + e);
		}
	}

	public static void method2() throws Exception {
		throw new Exception("Exception in method 2");// explicitly throws it
	}

}
