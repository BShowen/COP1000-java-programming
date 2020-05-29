package chapter_03;


import java.util.Scanner;
public class Exercise_03_10 {

	public static void main(String[] args) {
		//scanner class
		Scanner input = new Scanner(System.in);
		
		//generate 2 random numbers 0 to 99
		int number1 = (int)(Math.random() * 100);
		int number2 = (int)(Math.random() * 100);
		
		//prompt user to add them
		System.out.print("What is the sum of " + number1 + " + " + number2 + " ? ");
		
		//receive input
		int answer = input.nextInt();
		
		//display the results
		System.out.print(number1 + " + " + number2 + " = " + answer + " is " + (number1 + number2 == answer));
		

	}

}
