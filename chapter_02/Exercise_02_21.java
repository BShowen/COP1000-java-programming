import java.util.Scanner;
public class Exercise_02_21 {
	public static void main(String[] args) {
		// create scanner class;
		Scanner input = new Scanner(System.in);
		
		// prompt user for investment amount, interest rate, and years to invest
		System.out.print("Enter investment amount, interest rate (3.5), and years to invest: ");
		
		// receive input
		double investmentAmount    = input.nextDouble();
		double annualInterestRate  = input.nextDouble();
		double yearsToInvest       = input.nextDouble();
		double monthlyInterestRate = annualInterestRate / 1200d;
		
		// calculate future earnings
		double potentialEarnings = investmentAmount * Math.pow((1 + monthlyInterestRate), yearsToInvest * 12);
		
		// display result
		System.out.print("Future value is $" + potentialEarnings);
	}
}
