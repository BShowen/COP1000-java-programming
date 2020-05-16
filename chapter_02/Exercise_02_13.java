import java.util.Scanner;

public class Exercise_02_13 {
	public static void main(String[] args) {
		// create scanner class
		Scanner input = new Scanner(System.in);
	
		// declare variables needed
		final double SAVINGS_PERCENTAGE = 0.05 / 12.0;
		double totalAmountSaved;
		double monthlySavings;
		
		// prompt user for monthly saving amount
		System.out.print("Enter monthly savings amount: ");
		
		// receive input 
		monthlySavings = input.nextDouble();
		
		// calculate first month savings amount
		totalAmountSaved = monthlySavings * (1 + SAVINGS_PERCENTAGE); 
		
		// calculate second month saving amount
		totalAmountSaved = (monthlySavings + totalAmountSaved) * (1 + SAVINGS_PERCENTAGE);
		
		// calculate third month saving amount
		totalAmountSaved = (monthlySavings + totalAmountSaved) * (1 + SAVINGS_PERCENTAGE);
		
		// calculate fourth month saving amount
		totalAmountSaved = (monthlySavings + totalAmountSaved) * (1 + SAVINGS_PERCENTAGE);
		
		// calculate fifth month saving amount
		totalAmountSaved = (monthlySavings + totalAmountSaved) * (1 + SAVINGS_PERCENTAGE);
		
		// calculate sixth month saving amount
		totalAmountSaved = (monthlySavings + totalAmountSaved) * (1 + SAVINGS_PERCENTAGE);
		
		// display final amount to user
		System.out.print("After the sixth month, the account values is $" + (int)(totalAmountSaved * 100) / 100f );
	}
}
