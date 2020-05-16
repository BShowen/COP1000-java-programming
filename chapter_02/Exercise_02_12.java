import java.util.Scanner;

public class Exercise_02_12 {
	public static void main(String[] args) {
		// create scanner class
		Scanner input = new Scanner(System.in);
		
		// prompt user for speed and acceleration
		System.out.print("Enter speed and acceleration: ");
		
		// receive input
		double speed = input.nextDouble();
		double acceleration = input.nextDouble();
		
		// calculate minimum runway length
		double length = Math.pow(speed, 2) / (2 * acceleration);
		
		// display results
		System.out.print("The minimum runway length for this airplane is: " + length);
		
	}
}
