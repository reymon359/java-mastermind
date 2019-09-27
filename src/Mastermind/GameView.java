package Mastermind;

import java.io.IOException;
//import java.io.IOException;
import java.util.ArrayList;

public class GameView {

	public GameView() {
	}

	public void introduction() {
		System.out.println("Welcome to Mastermind.\n" + "You can guess the secret combination 10 times. Good luck!");
	}

	static void displayResultsTexts(ArrayList<String> results) {
		String s = "Attempts: " + results.size() + "\nThe previous results are: \n";
		for (int i = 0; i < results.size(); i++) {
			s += results.get(i) + "\n";
		}
		System.out.println(s);
	}

	public void displaySolution(String secretCode) {
		String s = "[";
		for (int i = 0; i < 4; i++) {
			if (i != 0)
				s += ", ";
			s += Combination.colourNames[Combination.colourCode.indexOf(secretCode.charAt(i))];
		}
		s += "]";
		System.out.println(s);
	}

	public boolean playAgain() {
		Boolean replay;
		String line = null;
		System.out.println("Want to play again? Enter Y (yes) or N (no)");
		do {

			try {
				line = new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}

			replay = line.charAt(0) == 'y' || line.charAt(0) == 'Y' 
					|| line.charAt(0) == 'n' || line.charAt(0) == 'N';
			if (!replay)
				System.out.println("Valid characters: Y, y, N, n");
		} while (!replay);

		return line.charAt(0) == 'y' || line.charAt(0) == 'Y';
	}

}
