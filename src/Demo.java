import java.util.Scanner; // imports object "Scanner", which is a user input

public class Demo {

	public static void main(String[] args) {
		//System.out.println("Hello World!");
		
		// Primitive (pre-defined) data types
		int a = 5;
		char b = 'i';
		long c = 400;
		double d = 3.2;
		
		// Objects
		String name = "Kimberley";
		// System.out.println(name);
		
		String upper = name.toUpperCase();
		// System.out.println(upper);
		
		String lower = name.toLowerCase();
		// System.out.println(lower);
		
		String exclaim = addExclamationPoint("hot dogs");
		// System.out.println(exclaim);
		
		// Use method defined in another class-file ("Animal.java")
		Animal e = new Animal();
		String dog = e.iAmDog();
		//System.out.println(dog);
		//e.doStuff();
		
		// Run method "sinus" from Java-Class "Calculator.java"
		// Static method
		//Calculator.sinus();
		//System.out.println(Calculator.degarcsin(0.71));
		//System.out.println(Calculator.radarcsin(0.71));
		Chatgpt.sinusgpt();
		
	}
	
	// Create new method
	// Source: https://www.youtube.com/watch?v=RRubcjpTkks
	
	public static String addExclamationPoint(String s) {
		// String defines the output of the method
		return s + "!";
	}

}