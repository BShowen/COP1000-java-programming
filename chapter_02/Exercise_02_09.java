import java.util.Scanner;

public class Exercise_02_09 {
	public static void main(final String[] args) {
		// create new scanner class
		final Scanner input = new Scanner(System.in);
		
		// prompt user for v0, v1, and t
		System.out.print("Enter v0 v1 and t:");
		
		// receive user input
		final double v0 = input.nextDouble();
		final double v1 = input.nextDouble();
		final double t = input.nextDouble();
		
		// calculate acceleration
		final double acceleration = (v1 - v0) / t;
		
		// display results to user
		System.out.print("The average acceleration is " + (int)(acceleration * 100) / 100f);
	}
}
