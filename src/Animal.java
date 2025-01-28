public class Animal {

	public static String iAmDog() {
		return "I am a dog";
	}

	public static void doStuff() {
		
		int a = 1;
		
		// if-statements
		
		if(a == 0) {
			System.out.println("a is zero.");
		} else if(a == 1) {
			System.out.println("a is one.");
		} else {
			System.out.println("a is neither zero or one");
		}
		
		// for-loop (i++ increases each time by 1)
		for(int i = 0; i<3; i++) {
			System.out.println(i);
		}
		
		// while-loop
		while(a < 10) {
			System.out.println(a);
			a++;
		}
		
		// try and catch
		//try {
		//	
		//} catch(Exception e) {
		//	
		//}
		
	}
}