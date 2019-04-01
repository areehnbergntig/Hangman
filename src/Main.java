import hangman.HangmanConsoleWindow;

public class Main {

	static HangmanConsoleWindow window = new HangmanConsoleWindow();
	
	final static String[] allWords = {"dog", "cat", "bird"}; // A list of words that can be used to play the game.
	
	static String wordProgress; 	// A String which starts out as for example "---" and gets updated with letters as the player guesses correctly.
	static String correctWord;		// The correct word that the player is supposed to guess. Is used to update the String wordProgress as the game progresses and is used for different comparisons.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	}

}
