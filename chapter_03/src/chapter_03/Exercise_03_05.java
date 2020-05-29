package chapter_03;

import java.util.Scanner;
public class Exercise_03_05 {

	public static void main(String[] args) {
		//scanner class
		Scanner input = new Scanner(System.in);
		
		//prompt user for input
		System.out.print("Enter today's day: ");
		
		//receive input
		int today = input.nextInt();
		
		//prompt user for input 
		System.out.print("Enter number of days elapsed since today: ");
		
		//receive input
		int futureDays = input.nextInt();
		
		//calculate the day
		int futureDay = (today + futureDays) % 7;
		
		//switch statement for week day
		switch(futureDay) {
			case 0: System.out.print("Sunday"); break;
			case 1: System.out.print("Monday"); break;
			case 2: System.out.print("Tuesday"); break;
			case 3: System.out.print("Wednesday"); break;
			case 4: System.out.print("Thursday"); break;
			case 5: System.out.print("Friday"); break;
			case 6: System.out.print("Satruday"); break;
			default: System.out.print("futureDay is " + futureDay);
		}
	}

}
