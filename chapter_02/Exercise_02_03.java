import java.util.Scanner;

public class Exercise_02_03 {
	public static void main(String[] args) {
		// create new scanner class
		Scanner input = new Scanner(System.in);
		
		// prompt user for measurement in feet
		System.out.print("Enter a measurment in feet: ");
		
		// receive input
		double feet = input.nextDouble();
		
		// convert feet to meters
		double meter = 0.305;
		double meters = feet * meter; 
		
		// display output to user
		System.out.print(feet + " feet is " + meters + " meters.");
	}
}
