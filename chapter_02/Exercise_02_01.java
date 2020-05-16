import java.util.Scanner;

public class Exercise_02_01 {
	public static void main(String[] args) {
		// create new Scanner object
		Scanner input = new Scanner(System.in);

		// prompt user to input a double
		System.out.print("Enter a degree in Celsius: ");
		double celsius = input.nextDouble();

		// convert Celsius to Fahrenheit
		double fahrenheit = 9.0 / 5 * celsius + 32;

		// display results
		System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit"); 
	}
}