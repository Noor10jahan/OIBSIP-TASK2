package guessNumbergame;

import java.util.Random;
import java.util.Scanner;

public class GuessNum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer, guess;
		int MAX = 100;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.nextLine();

		System.out.println("HELLO! " + name + " WELCOME TO GUESSING NUMBER GAME! \n");
		Random rand = new Random();
		answer = rand.nextInt(MAX) + 1;
		System.out.println("Lets play the guessing game \n");
		System.out.println("Enter the number");
		int count = 0;
		int guess1 = 0;
		for (int attempts = 0; attempts < 3; attempts++) {
			guess = sc.nextInt();
			guess1 = guess;
			if (attempts <=2) {
				if (guess == answer) {
					System.out.println("GOOD JOB! u guess the correct answer as " + answer);
					count++;
					break;
				} else if (answer > guess) {
     System.out.println("SORRY! you not guess the correct number The answer is greater than " + guess);
					count++;
				} else if (answer < guess){
	System.out.println("SORRY! you not guess the correct number The answer is lesser than " + guess);
					count++;
				}
			}
		}
		if (count == 1 && guess1 == answer) {
			System.out.println("score is 100%");
			System.out.println(name + " play next round");
			Round2.round();
		} else if (count == 2 && guess1 == answer) {
			System.out.println("score is 60%");
			System.out.println(name + " play next round");
			Round2.round();
		} else if (count == 3 && guess1 == answer) {
			System.out.println("score is 30%");
			System.out.println(name + " play next round");
			Round2.round();
		} else {
			System.out.println("\n score is 0%");
			System.out.println("\n and the answer is "+answer);
			System.out.println("\n play again");

		}

	}

}

class Round2 {
	static void round() {
		int answer, guess;
		int MAX = 100;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.nextLine();

		System.out.println("HELLO! " + name + " WELCOME TO GUESSING NUMBER GAME! \n");
		Random rand = new Random();
		answer = rand.nextInt(MAX) + 1;
		System.out.println("Lets play the guessing game \n");
		System.out.println("Enter the number");
		int count = 0;
		int guess1 = 0;
		for (int attempts = 0; attempts < 3; attempts++) {
			guess = sc.nextInt();
			guess1 = guess;
			if (attempts <=2) {
				if (guess == answer) {
					System.out.println("GOOD JOB! u guess the correct answer as " + answer);
					count++;
					break;
				} else if (answer > guess) {
     System.out.println("SORRY! you not guess the correct number The answer is greater than " + guess
							+ "\n Try again");
					count++;
				} else if (answer < guess){
					System.out.println("SORRY! you not guess the correct number The answer is lesser than " + guess
							+ "\n Try again");
					count++;
				}
			}
		}
		if (count == 1) {
			System.out.println("score is 100%");
		} else if (count == 2) {
			System.out.println("score is 60%");
			System.out.println(name + " play next round");
			Round2.round();
		} else if (count == 3 && guess1 == answer) {
			System.out.println("score is 30%");
			System.out.println(name + " play next round");
			Round2.round();
		} else {
			System.out.println("\n score is 0%");
			System.out.println("\n and the answer is "+answer);
			System.out.println("\n play again");

		}


	}
}
