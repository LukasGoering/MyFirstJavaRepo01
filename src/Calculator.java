import java.util.Scanner; // imports object "Scanner", which is a user input

public class Calculator {

	public static void sinus() {

		Scanner scan = new Scanner(System.in);
		
		// Ask if the angle will be entered in degrees or radians
		System.out.println("Do you want to enter the angle in degrees or radians?");
		String answer = scan.next().toLowerCase(); // Stores the user input in String answer and converts it to all lower case letters
		String Deg = "degrees";
		String Rad = "radians";
		
		// Ask for the angle.
		System.out.println("Please enter the angle using , as decimal separator.");
		double angle = scan.nextDouble();
		
		// Initialize sinValue
		// double sinValue;
		
		// Calculate the sinus-value
		
		if (answer.equals(Deg)) {
			double radians = Math.toRadians(angle);
			double sinValue = Math.sin(radians);
			System.out.println(sinValue);
			
		} else if (answer.equals(Rad)) {
			double sinValue2 = Math.sin(angle);
			System.out.println(sinValue2);
			
		} else {
			System.out.println("Please try again with degrees or radians");
		}
		
	}
	
	public static double degarcsin(double deg) {
		deg = Math.asin(deg);
		deg = Math.toDegrees(deg);
		return deg;
	}
	
	public static double radarcsin(double rad) {
		rad = Math.asin(rad);
		return rad;
	}

}