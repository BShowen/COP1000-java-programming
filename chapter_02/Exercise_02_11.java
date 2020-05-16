import java.util.Scanner;
public class Exercise_02_11 {
	public static void main(String[] args) {
		long currentPopulation = 312_032_486L;
		// seconds in a year
		long secondsInYear = 60 * 60 * 24 * 365;
		
		// calculate births per year. A birth happens every 7 seconds.
		double birthPerYear = secondsInYear / 7;
		
		// calculate deaths per second. A death happens every 13 seconds.
		double deathPerYear = secondsInYear / 13;
		
		// calculate immigrant per second. New immigrant every 45 seconds.
		double immigrantPerYear = secondsInYear / 45;
			
		// net gain per year
		long gainPerYear = (long)(birthPerYear + immigrantPerYear - deathPerYear);
		
		// create scanner class
		Scanner input = new Scanner(System.in);
		
		// prompt user for number of years
		System.out.print("Enter number of years: ");
		
		// receive input 
		double years = input.nextDouble();
		
		// calculate population 
		long population = currentPopulation + (gainPerYear * (long)years);
		
		// display results
		System.out.print("The population in " + (int)years + " years is " + population);
	}
}