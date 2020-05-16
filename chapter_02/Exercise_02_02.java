import java.util.Scanner;

public class Exercise_02_02 {

	public static void main(String[] args) {
		// create new scanner class
		Scanner input = new Scanner(System.in);
		
		// prompt user for radius and length of cylinder 
		System.out.print("Enter the length and radius of the cylinder: ");
		double length = input.nextDouble();
		double radius = input.nextDouble();
		
//		System.out.print("Enter the length of the cylinder: ");
		
		// compute volume of cylinder
		double area = radius * radius * 3.14159;
		double volume = area * length; 
		
		// round area and volume to two decimal places
		area = (int)(area * 100) / 100.0;
		volume = (int)(volume * 100) / 100.0;
		
		
		// display results to the user
		System.out.println("The area is " + area);
		System.out.println("The voume is " + volume);
		
	}
}
