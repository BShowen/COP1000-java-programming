import java.util.Scanner;
public class Exercise_02_17 {
	public static void main(String[] args) {
		//create scanner class
		Scanner input = new Scanner(System.in);
		
		//prompt user for input
		System.out.print("Enter the temperature in Fahrenheit between -58F and 41F:" );
		
		//receive input 
		double temp = input.nextDouble();
		
		//prompt user for input 
		System.out.print("Enter the wind speed (>=2) in miles per hour: " );
		
		//receive input 
		double windSpeed = input.nextDouble();
		
		//calulate wind chill factor
		double windChillIndex;
		windChillIndex = 35.74 + 0.6215 * temp - 
												35.75 * Math.pow(windSpeed, 0.16) + 
												0.4275 * temp * Math.pow(windSpeed, 0.16);
		
		
		//display the results
		System.out.print("The wind chill index is " + windChillIndex );
	}
}
