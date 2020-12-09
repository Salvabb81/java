package com.salva.algoritmos;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		// Classic way to get an integer
		int numberToGuess = 1 + (int)(100 * Math.random());
		
		// Java.Util.Random way to get an integer
		Random r = new Random();
		int numberToGuess2 = r.nextInt(100);
		
		int tries = 11;
		
		Scanner sc = new Scanner(System.in);
		int guessedNumber = 0;
		do {
			System.out.println("Please insert a number: ");
			guessedNumber = sc.nextInt();
			tries--;
			
			if (tries == 0) {
				System.out.println("End of the game. You lose!");
				break;
			} else if(guessedNumber > numberToGuess) {
				System.out.println("Your number is bigger. Try Again!");
			} else if (guessedNumber < numberToGuess) {
				System.out.println("Your number is smaller. Try Again!");
			} else {
				System.out.println("Congratulations! You won!");
				break;
			}
		} while(guessedNumber != numberToGuess);
		sc.close();
	}
	
}
