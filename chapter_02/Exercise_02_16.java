import java.util.Scanner;

public class Exercise_02_16 {
	public static void main(String[] args) {
		// create scanner class
		Scanner input = new Scanner(System.in);
		
		// prompt user for input
		System.out.print("Enter the length of the side: ");
		
		// receive input 
		double sideLength = input.nextDouble();
		
		// calculate area
		double area = (3 * Math.pow(3, 0.5) / 2) * Math.pow(sideLength, 2);
		
		// display results
		System.out.print("The area of the hexagon is " + area);
	}
}
