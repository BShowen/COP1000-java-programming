package chapter_03;

//scanner class
import java.util.Scanner;
public class Exercise_03_11 {
	public static void main(String[]args) {
		// create input
		Scanner input = new Scanner(System.in);
		
		//prompt user for month and year
		System.out.print("Enter a month and year and integers e.g. 3 2015: ");
		
		//receive input and close input stream
		int month = input.nextInt();
		int year = input.nextInt();
		input.close();
		
		//determine leap year or not
		boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
		
		//determine month and print the days in that month
		switch(month) {
			case 1:  System.out.print("January " + year + " has 31 days in it"); break;
			case 2:  
				if (isLeapYear)
					System.out.print("February " + year + " has 29 days in it"); 
				else
					System.out.print("February " + year + " has 28 days in it"); 
				break;
			case 3: System.out.print("March " + year + " has 31 days in it"); break;
			case 4: System.out.print("April " + year + " has 30 days in it"); break;
			case 5: System.out.print("May " + year + " has 31 days in it"); break;
			case 6: System.out.print("June " + year + " has 30 days in it"); break;
			case 7: System.out.print("July " + year + " has 31 days in it"); break;
			case 8: System.out.print("August " + year + " has 31 days in it"); break;
			case 9: System.out.print("September " + year + " has 30 days in it"); break;
			case 10: System.out.print("October " + year + " has 31 days in it"); break;
			case 11: System.out.print("November" + year + " has 30 days in it"); break;
			case 12: System.out.print("December" + year + " has 31days in it"); break;
		}
	}
}
