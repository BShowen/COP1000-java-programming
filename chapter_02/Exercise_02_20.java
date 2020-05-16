import java.util.Scanner;
public class Exercise_02_20 {
	public static void main(String[] args) {
		// create scanner class
		Scanner input = new Scanner(System.in);
		
		// prompt user for balance and interest
		System.out.print("Enter balance and interest rate: ");
		
		// receive input 
		double balance        = input.nextDouble();
		double annualInterest = input.nextDouble();
		
		// compute next month interest
		double interest = balance * (annualInterest / 1200);

		
		// display the result
		System.out.print("The interest is $" + interest);
	}
}
