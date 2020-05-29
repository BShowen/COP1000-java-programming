package chapter_03;

import java.util.Scanner;
public class Exercise_03_01 {
	public static void main(String[] args) {
		//scanner class
		Scanner input = new Scanner(System.in);
		
		//prompt user for a, b and c
		System.out.print("Enter a, b and c: ");
		
		//receive input
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		//calculate the descriminant
		double discriminant = Math.pow(b, 2) - (4 * a * c);
		
		if(discriminant > 0) {
			//if discriminant is posotive the equation has two real roots		
			double root1 = (-b + Math.pow(discriminant, 0.5)) / 2* a;
			double root2 = (-b - Math.pow(discriminant, 0.5)) / 2* a;
			System.out.print("The equation has two roots " + root1 + " " + root2);
		}
		else if(discriminant == 0){ 
			//if discriminant is 0 the equation has one real root
			double root1 = (-b + Math.pow(discriminant, 0.5)) / 2* a;
			System.out.print("The equation has one root " + root1);
		}
		else if(discriminant < 0) {
			//if the discriminant is negative the equation has no real roots
			System.out.print("The equation has no real roots.");
		}
	}
}