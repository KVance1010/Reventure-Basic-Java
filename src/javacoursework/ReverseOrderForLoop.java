package javacoursework;

public class ReverseOrderForLoop {

	public static void main(String[] args) {
		String[] cities = { "Atlanta", "Charlotte", "Dallas", "Los Angeles", "New York", "Orlando", "Philadelphia",
				"Seattle" };

		// print the result
		for (int i = 0; i < cities.length; i++) {
			System.out.println(cities[i]);
		}
		
		System.out.println("");
		
		for(int i = cities.length-1; i > 0; --i) {
			System.out.println(cities[i]);
		}
		
	}
}
