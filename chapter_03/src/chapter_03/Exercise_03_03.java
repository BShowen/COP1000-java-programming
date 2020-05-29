package chapter_03;

import java.util.Scanner;
public class Exercise_03_03 {

	public static void main(String[] args) {
		//scanner class
		Scanner input = new Scanner(System.in);
		
		//prompt user for a, b, c, d, e, and f
		System.out.print("Enter a, b, c, d, e, and f: ");
		
		//receive input
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
		
		if(a * d - b * c == 0) {
			//if ad - cd == 0 the equation has no solution
			System.out.print("The equation has no solution");
		}
		else {
			//else, solve Cramers rule
			double x = (e * d - b * f) / (a * d - b * c);
			double y = (a * f - e * c) / (a * d - b * c);
			System.out.print("x is: " + x + " and y is: " + y);
		}
	}
}
