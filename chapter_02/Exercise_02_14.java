import java.util.Scanner;

public class Exercise_02_14 {
	public static void main(String[] args ) {
		//create scanner class
		Scanner input = new Scanner(System.in);
		
		//prompt user for weight(lbs) and height(inches)
		System.out.print("Enter your weight (in lbs),and your height (in inches): ");
		
		//declare needed variables
		double weight;
		double height;
		double bmi;
		
		//receive input
		weight = input.nextDouble();
		height = input.nextDouble();
		
		//convert lbs to kilos and inches to meters
		weight *= 0.45359237;
		height *= 0.0254;
		
		//calculate BMI. Formula = weight(kg) / height(m * m)
		bmi = weight / (height * height); 
	
		//display results to user
		System.out.print("BMI is " + bmi);
	}
}
