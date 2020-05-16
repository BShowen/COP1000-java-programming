import java.util.Scanner;

public class ComputeChange {

	public static void main(String[] args) {
		// create new scanner class
		Scanner input = new Scanner(System.in);
		
		//obtain dollar amount from user as double. 
		System.out.print("Enter the total dollar amount, e.g 250.50: ");
		double totalDollars = input.nextDouble();
		int remainingAmount = (int)(totalDollars * 100 + 0.1);
		
		//calc. max dollars
		int dollars = (int)(remainingAmount / 100);
		
		remainingAmount = remainingAmount % 100;
		
		//calc. max quarters
		int quarters = remainingAmount / 25;
		remainingAmount %= 25; 
		
		//calc. max dimes
		int dimes = remainingAmount / 10;
		remainingAmount %= 10;
		
		//calc. max nickels
		int nickels = remainingAmount / 5;
		remainingAmount %= 5;
		
		//calc. max pennies 
		int pennies = (int)(remainingAmount);
		
		//display the results to the user
		System.out.println("Your amount " + totalDollars + "consists of");
		System.out.println("  " + dollars + " dollars");
		System.out.println("  " + quarters + " quarters");
		System.out.println("  " + dimes + " dimes");
		System.out.println("  " + nickels + " nickels");
		System.out.println("  " + pennies + " pennies");

	}

}
