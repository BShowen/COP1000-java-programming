import java.util.Scanner;

public class Exercise_02_06 {
	public static void main(String[] args) {
		// create scanner class
		Scanner input = new Scanner(System.in);
		
		// promt user for digits 
		System.out.print("Enter a number between 0 and 1000: ");
		
		// receive and set input to variables 
		int originalNumber = input.nextInt();
		int remainingDigits = originalNumber;
		
		// set variable sum to last digit of remainingDigits
		int sum = remainingDigits / 100;
		
		// update remainingDigist to not include the last digit 
		remainingDigits %= 100;
		
		// add the last digit from reaminingDigist to the sum
		sum += remainingDigits / 10;
		
		// update remaininDigist to not include last digit. There should be only one digit remaining at this point.
		remainingDigits %= 10;
		
		// add the remaining digit to sum
		sum += remainingDigits; 
		
		// display the sum to the user
		System.out.print("The sum of the digits in " + originalNumber + " is " + sum );
	}
}
