public class Animal {

	public static String iAmDog() {
		return "I am a dog";
	}

	public static void doStuff() {
		
		int z = 1;
		
		// if-statements
		
		if (z == 0) {
			System.out.println("a is zero.");
		} else if (z == 1) {
			System.out.println("a is one.");
		} else {
			System.out.println("a is neither zero or one");
		}
		
		// for-loop (i++ increases each time by 1)
		for (int i = 0; i<3; i++) {
			System.out.println(i);
		}
		
		// while-loop
		while (z < 10) {
			System.out.println(z);
			z++;
			
			
		}
		
		// try and catch
		//try {
		//	
		//} catch(Exception e) {
		//	
		//}
		
	}
}