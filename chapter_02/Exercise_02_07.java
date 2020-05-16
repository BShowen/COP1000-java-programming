import java.util.Scanner;

public class Exercise_02_07 {
	public static void main(String[] args) {
		// create new scanner class
		Scanner input = new Scanner(System.in);
		
		// prompt user for input
		System.out.print("Enter the number of minutes: ");
		
		// receive input
		int minutes = input.nextInt();
		
		// convert billions of minutes to hours
		int hours = minutes / 60;
		
		// convert hours to days 
		int days = hours / 24;
		
		// convert days to years
		int years = days / 365;
		
		// get remaining days from years
		int remainingDays = days % 365;
		
		// display output to user
		System.out.print(minutes + " minutes is approximately " + years + " years and " + remainingDays + " days");
	}
}
