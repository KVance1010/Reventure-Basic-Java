package javacoursework;

public class MethodParams {

	public static void main(String[] args) {

		// create a class instance
		MethodParams mp = new MethodParams();

		// call your method here
		double d = mp.convertIntToDouble(44);

		// print the value to the console
		System.out.println(d);

		// call the 2nd method here
		System.out.println(mp.sum(1.0, 2, 3));
	}

	// create your first method here
	public double convertIntToDouble(int num) {
		return (double) num;
	}

	// new sum method here
	public double sum(double num1, int num2, int num3) {
		return num1 + num2 + num3;
	}

	// Exercise 1 solution
	public double[] square(int a, int b, int c, int d) {
		double[] result = { a * a, b * b, c * c, d * d };
		return result;
	}

	// Exercise 2 solution
	public String findFirstWord(String a, String b) {

		// convert Strings to array for iterating over
		char[] aArray = a.toCharArray();
		char[] bArray = b.toCharArray();

		// loop through letters of each
		for (int i = 0; i < aArray.length; i++) {

			// if letter in a comes before b, then return a
			if (aArray[i] < bArray[i]) {
				return a;
     		}

			// check if letter in b comes before a
			if (aArray[i] > bArray[i]) {
				return b;
			}

			// otherwise they are equal and you can move to the next letter
		}

		/* you need this line in case the above loop doesn't return anything.
		this is for the compiler. */

		return a;
	}
}
