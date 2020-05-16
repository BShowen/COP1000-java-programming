import java.util.Scanner;

public class Exercise_02_05 {
	public static void main(String[] args) {
		// create scanner class
		Scanner input = new Scanner(System.in);
		
		// prompt user for subtotal 
		System.out.print("Enter the subtotal: ");
		
		// receive subtotal
		double subtotal = input.nextDouble();
		
		// prompt user for gratuity rate 
		System.out.print("Enter the gratuity rate: ");
		
		// receive gratuity rate
		double gratuityRate = input.nextDouble();
		
		// convert gratuity rate to percentage 
		gratuityRate /= 100; 
		
		// calculate gratuity
		double gratuityAmount = subtotal * gratuityRate; 
		
		// calculate total with gratuity incuded 
		double total = subtotal + gratuityAmount;
		
		// display the gratuity amount and total to the user
		System.out.print("The gratuity is $" + gratuityAmount + "and the total is $" + total); 
	}
}
