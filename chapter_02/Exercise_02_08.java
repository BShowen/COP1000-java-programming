import java.util.Scanner;

public class Exercise_02_08 {
	public static void main(String[] args) {
		// create scanner class
		Scanner input = new Scanner(System.in);
		
		// prompt user for timezone offset in hours
		System.out.print("Enter trhe time zone offset to GMT: ");
		
		// receive input for timezone offset
		int offset = input.nextInt();
		
		// get time using System.currentTimeMillis();
		long currentMillis = System.currentTimeMillis(); 
		
		// total seconds
		long totalSeconds = currentMillis / 1000;
		
		// total minutes
		long totalMinutes = totalSeconds / 60;
		
		// total hours
		long totalHours = totalMinutes / 60;
		
		// get current second
		long currentSecond = totalSeconds % 60;
		
		
		// get current minute
		long currentMinute = totalMinutes % 60;
		
		// get current hour + offset
		long currentHour = totalHours % 24;
		currentHour = (currentHour + offset) % 12;
		
		// display results to user
		System.out.print("The current tim is " + currentHour + ":" + currentMinute + ":" + currentSecond);
	}
}
