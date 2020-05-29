package chapter_03;

//import scanner class
import java.util.Scanner;
public class Exercise_03_14 {
	public static void main(String[] args) {
		//create input class
		Scanner input = new Scanner(System.in);
		
		//prompt user for a guess of heads or tails
		System.out.print("Enter a guess of heads or tails: ");
		
		//receive input 
		String guess = input.nextLine();
		input.close();
		
		//toss the coin 0 = heads / 1 = tails
		int coinToss = (int)(Math.random() * 2);
		
		//convert toss to string
		String answer = coinToss == 0 ?  "heads" : "tails" ;
		
		//display results
		System.out.println("You guess: " + guess);
		System.out.println("The toin coss revealed: " + answer);
		System.out.print("You were " + (guess.equals(answer) ? "correct!" : "wrong."));
		
	}
}
