package chapter_03;

import java.util.Scanner;
public class Exercise_03_07 {
	public static void main(String[] args) {
		//scanner class
		Scanner input = new Scanner(System.in);
		
		//propmt for input
		System.out.print("Enter an amount in double, for example 11.56:  ");
		
		//receive input
		double amount = input.nextDouble();
		
		int remainingAmount = (int)(amount * 100);
		
		//get remaining one dollars
		int numberOfOneDollars = remainingAmount / 100;
		remainingAmount %= 100; 

		//get number of quarters
		int numberOfQuarters = remainingAmount / 25;
		remainingAmount %= 25;
		
		//get number of dimes
		int numberOfDimes = remainingAmount / 10;
		remainingAmount %= 10;
		
		//get number of nickels
		int numberOfNickels = remainingAmount / 5;
		remainingAmount %= 5;
		
		//get number of pennies
		int numberOfPennies = remainingAmount;
		
		//display results
		System.out.println("Your amount of " + amount + " consists of: ");
		
		if (numberOfOneDollars != 0) {
			System.out.println(" " + numberOfOneDollars + (numberOfOneDollars > 1 ? " dollars" : " dollar"));
		}
		
		if(numberOfQuarters != 0) {
			System.out.println(" " + numberOfQuarters + (numberOfQuarters > 1 ? " quarters" : " quarter"));
		}
		
		if(numberOfDimes != 0) {
			System.out.println(" " + numberOfDimes + (numberOfDimes > 1 ? " dimes" : " dime"));
		}
		
		if(numberOfNickels != 0) {
			System.out.println(" " + numberOfNickels + (numberOfNickels > 1 ? " nickels" : " nickel"));
		}
		
		if(numberOfPennies != 0) {
			System.out.println(" " + numberOfPennies + (numberOfPennies > 1 ? " pennies" : " penny"));
		}
		
	}
}
