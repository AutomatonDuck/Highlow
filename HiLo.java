package highlow;
import java.util.Scanner;
public class HiLo {

	public static void main(String[] args) {
		//create a new scanner object, and use keyboard as input
		Scanner scan = new Scanner(System.in);
		String playAgain ="";
		do {
			// generate a random number for user to guess
			int theNumber = (int)(Math.random() * 100 +1);
			//System.out.println(theNumber);
			int guess = 0;
			int guessNum = 0;
			//System is a class that refers to the system(OS in this case)
			//the the program is run on
			while (guess != theNumber) {
				System.out.println("Guess a number between 1 and 100:");
				//get user input
				guess = scan.nextInt();
				//System.out.println("You  entered " + guess +".");
				if (guess < theNumber) {
					System.out.println(guess + " is too low. Try again");
					guessNum += 1;
				}
				if (guess > theNumber) {
					System.out.println(guess + " is too high. Try again");
					guessNum += 1;
				}
			}
			System.out.println("Congrates you guessed the number correctly");
			System.out.println("It took you " + guessNum +" guesses.");
			System.out.println("Would You like to play again?");
			playAgain = scan.next();
		} while (playAgain.equalsIgnoreCase("y"));
		System.out.println("Thank you for playing");
		scan.close();
	}

}
