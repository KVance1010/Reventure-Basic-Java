package javacoursework;

public class ReturnTypes {

	public static void main(String[] args) {

		// create a class instance
		ReturnTypes rt = new ReturnTypes();

		// call your method here
		rt.returnNothing();

		// call the other method here
		boolean b = rt.returnBoolean();
		System.out.println("The value of b is: " + b);
	}

	// create your first method here
	public void returnNothing() {
		System.out.println("Inside of a void method");
	}

	// a method that returns a boolean
	public boolean returnBoolean() {
		return true;
	}
	
	// Exercise 1 solution
	public double getPi(){
		return Math.PI;
	}
	
	//Exercise 2 solution
	public char[] getAlphabetArray() {

		char[] letters = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
				'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r','s', 't', 'u', 'v', 
				'w','x', 'y', 'z' };

		return letters;
	}

}
