package chapter_03;

//import scanner class
import java.util.Scanner;
public class Exercise_03_12 {

	public static void main(String[] args) {
		// create input class
		Scanner input = new Scanner(System.in);
		
		//prompt user for input 
		System.out.print("Enter a three digit number: ");
		
		//receive input and close input stream
		int number = input.nextInt();
		input.close();
		
		//get first and last digit
		int copyOfNumber = number;
		int lastDigit = copyOfNumber % 10;
		copyOfNumber /= 10;
		copyOfNumber /= 10;
		int firstDigit = copyOfNumber;
		
		//determine if number is palindrome
		if(firstDigit == lastDigit) 
			System.out.print(number + " is a palindrome.");
		else
			System.out.print(number + " is not a palindrome.");				

	}

}
