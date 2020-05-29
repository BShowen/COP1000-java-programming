package chapter_03;

import java.util.Scanner;
public class Exercise_03_06 {

	public static void main(String[] args) {
		//scanner class
		Scanner input = new Scanner(System.in);
		
		//enter feet
		System.out.print("Enter feet: ");
		//receive input
		double feet = input.nextDouble();
		
		//enter inches
		System.out.print("Enter inches: ");
		//receive input
		double inches= input.nextDouble();
		
		//enter weight
		System.out.print("Enter weight in pounds: ");
		//receive input
		double pounds = input.nextDouble();
		
		//convert height to meters and weight to kilos
		double heightInInches = feet * 12 + inches ;
		double heightInMeters = heightInInches * 0.0254;
		double weightInKilos = pounds * 0.45359237; 
		
		//calculate BMI
		double bmi = weightInKilos / Math.pow( heightInMeters, 2);
		
		//display results	
		System.out.println("BMI is " + (int)(bmi * 100) / 100.0);
		if(bmi < 18.5)
			System.out.print("Underweight");
		else if(bmi < 25)
			System.out.print("Normal");
		else if(bmi < 30)
			System.out.print("Overweight");
		else 
			System.out.print("Obese");
		
		
		
	}
}