import java.util.Scanner;

public class Exercise_02_04 {
	public static void main(String[] args) {
		// create new scanner
		Scanner input = new Scanner(System.in);
		
		// prompt user for weight in lbs 
		System.out.print("Enter your weight in pounds: ");
		
		// receive input
		double pounds = input.nextDouble();
		
		// convert lbs to kilo
		double kilo = 0.454;
		double kilos = pounds * kilo; 
		
		// display results to user
		System.out.print(pounds + " punds is " + kilos + " kilos");
	}
}
