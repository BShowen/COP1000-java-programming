import java.util.Scanner;
public class Exercise_02_15 {
	public static void main(String[] args) {
		// create scanner class
		Scanner input = new Scanner(System.in);
		
		// prompt user for x1, y1, x2, y2
		System.out.print("Eneter x1, y1, x2, y2: ");
		
		// receive input
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		// calculate distance
		double distance = Math.pow( Math.pow((x2 -x1), 2) + Math.pow((y2 - y1), 2), 0.5);
		
		// display results
		System.out.print("The distance between the two points is " + distance);
	}
}
