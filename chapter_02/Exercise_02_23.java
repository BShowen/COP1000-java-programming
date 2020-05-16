import java.util.Scanner;
public class Exercise_02_23 {
	public static void main(String[] args) {
		// create scanner class
		Scanner input = new Scanner(System.in);
		
		// prompt for driving distance, mpg, price per gallon of fuel. 
		System.out.print("Enter distance, mpg, and price per gallon: ");
		
		// receive input 
		double distance       = input.nextDouble();
		double mpg            = input.nextDouble();
		double pricePerGallon = input.nextDouble();
		
		// calculate cost of driving
		// price per gallon / mpg = cost per mile
		double costPerMile = pricePerGallon / mpg;
		double totalCost = costPerMile * distance;
		totalCost = (int)(totalCost * 100) / 100d;
		
		// display output
		System.out.print("The cost of driving is $" + totalCost);
	}
}
