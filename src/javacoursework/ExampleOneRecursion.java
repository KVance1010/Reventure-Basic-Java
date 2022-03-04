package javacoursework;

public class ExampleOneRecursion {

	public static void main(String[] args) {

		// create some dummy data for our method
		int input = 5;
        char input1 = 'g';
		ExampleOneRecursion eo = new ExampleOneRecursion();
		printChar(input1);
		System.out.println("");
		
		// call the method here
		System.out.println(eo.factorial(input));
	}

	// create your first method here
	public int factorial(int num) {

		if (num <= 0)
			return 0;

		if (num == 1)
			return 1;

		return num * factorial(num - 1);
	}

	// Exercise 1 solution 
	public static void printChar(char input) {

		if (input < 'a' || input > 'z')
			return;

		System.out.print(input);
		input -= 1;
		printChar(input);
	}
}
