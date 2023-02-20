
public class VariablesTest {
	public int addOfTwo(int a, int b) {
		return a + b;
	}

	public static void subOfTwo(int a, int b) {
		int result = a - b;
		System.out.println("sub of two numbers : " + result);
	}

	public void mulofTwo() {
		int result = 200 * 300;
		System.out.println("mul of two numbers : " + result);
	}

	static int countryCode = 91;// static variable
	int empId = 1231; // instnace variable -->instance and static 4 bytes

	public static void main(String[] args) {
		byte age = 28;// local variables
		long contact = 9494949494l;
		float salary = 19.546372342f;
		double value = 90.2342342342342;
		char gender = 'm';
		boolean result = false;
		System.out.println(age + " " + contact + " " + salary + " " + value + " " + gender + " " + result);
		System.out.println(VariablesTest.countryCode);
		VariablesTest.subOfTwo(500, 250);
		VariablesTest obj = new VariablesTest();
		System.out.println(obj.empId);
		System.out.println(obj.addOfTwo(13, 14));
		obj.mulofTwo();
	}
}
