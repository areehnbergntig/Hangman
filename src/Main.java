import java.util.ArrayList;

import hangman.HangmanConsoleWindow;

public class Main {

	static HangmanConsoleWindow window = new HangmanConsoleWindow();
	
	final static String[] allWords = {"dog", "cat", "bird"}; // A list of words that can be used to play the game.
	
	static ArrayList<Character> guessedLetters = new ArrayList<Character>();	// A list to be filled with all the incorrectly guessed letters.
	static String wordProgress; 	// A String which starts out as for example "---" and gets updated with letters as the player guesses correctly.
	static String correctWord;		// The correct word that the player is supposed to guess. Is used to update the String wordProgress as the game progresses and is used for different comparisons.
	static int hp;
	
	public static void main(String[] args) {
		
	}
	
	
	
	/* -------------------------- */
	/* --- Big game methods ----- */
	/* -------------------------- */
	
	/**
	 * Performs all necessary actions to play one game of Hangman.
	 * 
	 * @return True if player wants to play again, false if not.
	 */
	public static boolean oneGame() {
		//TODO
		
		return false; //placeholder
	}

	/**
	 * Performs all necessary actions to play one round of Hangman.
	 * 
	 * @return True if player has won the game, false if not.
	 */
	public static boolean oneRound() {
		//TODO
		
		return false; //placeholder
	}

	/**
	 * Performs all necessary actions to guess one time.
	 * 
	 */
	public static void oneGuess() {
		//TODO
		
	}
	
	

	/* -------------------------- */
	/* --- Small game methods --- */
	/* -------------------------- */
	
	/**
	 * Randomizes a word from the static arraylist allWords.
	 * 
	 * @return The word that has been randomized.
	 */
	public static String randomizeWord() {
		//TODO
		
		return ""; //placeholder
	}

	/**
	 * Performs all necessary actions when the player has guessed a letter correctly.
	 * 
	 */
	public static void goodGuess() {
		//TODO
	}

	/**
	 * Performs all necessary actions when the player has guessed a letter incorrectly.
	 * 
	 */
	public static void badGuess() {
		//TODO
	}
	
	

	/* -------------------------- */
	/* --- Comparison methods --- */
	/* -------------------------- */

	/**
	 * Checks if the user has guessed correctly.
	 * 
	 * @return True if user has guessed correctly, false if not.
	 */
	public static boolean hasGuessedCorrectly(char c) {
		//TODO
		
		return false; //placeholder
	}

	/**
	 * Checks if the user has won the game.
	 * 
	 * @return True if user has won, false if not.
	 */
	public static boolean hasWon() {
		//TODO
		
		return false; //placeholder
	}

	/**
	 * Checks if the user wants to play another game.
	 * 
	 * @return True if user wants to play again, false if not.
	 */
	public static boolean wantToPlayAgain() {
		boolean result = false;
		boolean correctInput = false;
		while(!correctInput) {
			window.println("Do you want to play again? y/n");
			char answer = window.nextChar();
			if(answer == 'y') {
				correctInput = true;
				result = true;
			} else if(answer == 'n') {
				correctInput = true;
				result = false;
			} else {
				correctInput = false;
			}
		}
		return result;
		
	}
	
	

	/* -------------------------- */
	/* --- Message methods ------ */
	/* -------------------------- */
	
	/**
	 * Prints a message to be shown at the start of a new game.
	 * 
	 */
	public static void printStartOfGameMessage() {
		window.println("Welcome to Hangman! \nPress any letter to guess that letter. \n\nYour life, progress, and already guessed \nletters are shown below. \n\nHave fun!\n");
	}

	/**
	 * Prints a message to be shown at the start of a new round.
	 * 
	 */
	public static void printStartOfRoundMessage() {
		window.println(wordProgress + "\nYou have " + hp + " tries remaining. \nTime to guess!");
	}

	/**
	 * Prints a message to be shown when the player has won the game.
	 * 
	 */
	public static void printWinningMessage() {
		window.println("Congratulations, you won! \nNo hanging today.\n");
	}

	/**
	 * Prints a message to be shown when the player has lost the game.
	 * 
	 */
	public static void printLosingMessage() {
		window.println("Oh no, you lost! \nPoor fellow.\n");
	}

	/**
	 * Prints a message to be shown at the end of a play session.
	 * 
	 */
	public static void printEndOfSessionMessage() {
		window.println("Okay, thanks for playing. \nHope you had fun!\n");
	}
	
	

}
