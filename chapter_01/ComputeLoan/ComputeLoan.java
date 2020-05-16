import java.util.Scanner;

public class ComputeLoan {

	public static void main(String[] args) {
		// create a scanner
		Scanner input = new Scanner(System.in);

		// Obtain annual interest rate
		System.out.print("Enter the annual interest rate, e.g 2.5: ");
		double annualInterestRate = input.nextDouble();
		
		// Compute monthly interest rate from annual rate
		double monthlyInterestRate = annualInterestRate / 1200;
		
		// Obtain loan term in years
		System.out.print("Enter the number of years for the loan, e.g 1.5: ");
		double loanYears = input.nextDouble();
		
		// Obtain loan amount
		System.out.print("Enter the loan amount, e.g 1453.29:");	
		double loanAmount = input.nextDouble();
				
		// Calculate payments
		double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, loanYears * 12));
		double totalPayment = monthlyPayment * loanYears * 12; 
		
		// Format payments
		monthlyPayment = (int)(monthlyPayment * 100) / 100.0;
		totalPayment = (int)(totalPayment * 100) / 100.0;
		
		
		// Display monthly payment and total payment
		System.out.println("Your monthly payment will be:                     $" + monthlyPayment);
		System.out.println("Your total payment will be:                       $" + totalPayment);
		System.out.println("Difference between loan amount and total payment: $" + (int)((totalPayment - loanAmount) * 100) / 100.0);
		
	}

}
