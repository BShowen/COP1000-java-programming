package chapter_03;

import java.util.Scanner;
public class Exercise_03_08 {

	public static void main(String[] args) {
		//scanner class
		Scanner input = new Scanner(System.in);
		
		//prompt for input
		System.out.print("Please enter three different numbers: ");
		
		//receive input
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();
		
		//sort numbers
		if(number1 == number2 || number2 == number3 || number1 == number3) {
			System.out.print("Please dont enter duplicate numbers");
		}
		else if(number1 > number3 && number1 > number2) {
			//number1 goes last
			if(number2 > number3) {
				//number3 number2 number1
				System.out.print(number3 + " " + number2 + " " + number1);
			}
			else {
				//number1 number2 number3
				System.out.print(number2 + " " + number3 + " " + number1);
			}
		}
		else if(number2 > number1 && number2 > number3) {
			//number2 goes last
			if(number1 > number3) {
				//number3 number1 number2
				System.out.print(number3 + " " + number1 + " " + number2);
			}
			else {
				//number1 number3 number2
				System.out.print(number1 + " " + number3 + " " + number2);
			}
		}
		else if(number3 > number1 && number3 > number2) {
			//number3 goes last
			if(number1 > number2) {
				//number2 number1 number3
				System.out.print(number2 + " " + number1 + " " + number3);
			}
			else {
				//number1 number2 number3
				System.out.print(number1 + " " + number2 + " " + number3);
			}
		}
		
		
		
		
		//display output

	}

}
