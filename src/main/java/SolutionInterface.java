import java.util.Scanner;

public class SolutionInterface {

	public static void main(String[] argh) {
		MyCalculator my_calculator = new SolutionInterface().new MyCalculator();
		System.out.print("I implemented: ");
		ImplementedInterfaceNames(my_calculator);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(my_calculator.divisorSum(n) + "\n");

	}

	/*
	 * ImplementedInterfaceNames method takes an object and prints the name of
	 * the interfaces it implemented
	 */
	static void ImplementedInterfaceNames(Object o) {

		Class[] theInterfaces = o.getClass().getInterfaces();
		for (int i = 0; i < theInterfaces.length; i++) {
			String interfaceName = theInterfaces[i].getName();
			System.out.println(interfaceName);
		}
	}

	interface AdvancedArithmetic {
		public abstract int divisorSum(int n);
	}

	class MyCalculator implements AdvancedArithmetic {

		@Override
		public int divisorSum(int n) {

			int sum = 0;
			int limit = n;

			for (int i = 1; i <= limit; ++i) {
				// Has a remainder/modulus of zero
				if (n % i == 0) {
					sum += i;
				}
			}
			return sum;
		}

	}

}
