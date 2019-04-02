import hangman.HangmanConsoleWindow;

public class Main {

	static HangmanConsoleWindow window = new HangmanConsoleWindow();
	
	final static String[] allWords = {"dog", "cat", "bird"}; // A list of words that can be used to play the game.
	
	static String wordProgress; 	// A String which starts out as for example "---" and gets updated with letters as the player guesses correctly.
	static String correctWord;		// The correct word that the player is supposed to guess. Is used to update the String wordProgress as the game progresses and is used for different comparisons.
	
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
		//TODO
		
		return false; //placeholder
	}
	
	

	/* -------------------------- */
	/* --- Message methods ------ */
	/* -------------------------- */
	
	/**
	 * Prints a message to be shown at the start of a new game.
	 * 
	 */
	public static void printStartOfGameMessage() {
		System.out.println("Welcome to Hangman! Press any letter to guess that letter. \nYour life, progress, and already guessed letters are shown below. \nHave fun!");
	}

	/**
	 * Prints a message to be shown at the start of a new round.
	 * 
	 */
	public static void printStartOfRoundMessage() {
		//TODO
	}

	/**
	 * Prints a message to be shown when the player has won the game.
	 * 
	 */
	public static void printWinningMessage() {
		System.out.println("Congratulations, you won! No hanging today.");
	}

	/**
	 * Prints a message to be shown when the player has lost the game.
	 * 
	 */
	public static void printLosingMessage() {
		System.out.println("Oh no, you lost! Poor fellow.");
	}

	/**
	 * Prints a message to be shown at the end of a play session.
	 * 
	 */
	public static void printEndOfSessionMessage() {
		System.out.println("Okay, thanks for playing, hope you had fun!");
	}
	
	

}
