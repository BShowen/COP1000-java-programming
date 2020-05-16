import java.util.Scanner;

public class Exercise_02_10 {
	public static void main(String[] args){
		// create scanner class
		Scanner input = new Scanner(System.in);
		
		// declare variables
		double waterWeight;
		double initialTemp;
		double finalTemp;
		double energyNeeded;
		
		// prompt user for water in kilos
		System.out.print("Enter the amount of water in kilos: ");
		
		// receive input
		waterWeight = input.nextDouble();
		
		// prompt user for initial temp
		System.out.print("Enter the initial temperature in Celsius: ");
		
		// receive input 
		initialTemp = input.nextDouble();
		
		// prompt user for final temp
		System.out.print("Enter the final temperature in Celsius: ");
		
		// receive input
		finalTemp = input.nextDouble();
		
		// calulate energy needed
		energyNeeded = waterWeight * (finalTemp - initialTemp) * 4184;
		
		// display results
		System.out.print("The energy needed is " + energyNeeded);
	}
}
