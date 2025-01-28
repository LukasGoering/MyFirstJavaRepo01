public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hello World!");
		
		// Primitive (pre-defined) data types
		int a = 5;
		char b = 'i';
		long c = 400;
		double d = 3.2;
		
		// Objects
		String name = "Susan";
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
		System.out.println(dog);
		e.doStuff();
		
	}
	
	// Create new method
	// Source: https://www.youtube.com/watch?v=RRubcjpTkks
	
	public static String addExclamationPoint(String s) {
		// String defines the output of the method
		return s + "!";
	}

}