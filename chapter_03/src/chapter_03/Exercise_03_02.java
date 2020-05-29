package chapter_03;

import java.util.Scanner;
public class Exercise_03_02 {

	public static void main(String[] args) {
		//scanner class
		Scanner input = new Scanner(System.in);
		
		//create three single digit numbers
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		int number3 = (int)(Math.random() * 10);

		//display numbers to user and prompt them to return the sum
		System.out.print("What is the sum of " + number1 + " + " + number2 + " + " + number3 + ":  ");
		
		//receive input
		int answer = input.nextInt();
		
		//calculate true/false and display restults
		System.out.print(number1 + " + " + number2 + " + " + number3 + " = " +  answer + " is " + (number1 + number2 + number3 == answer));
	}

}
