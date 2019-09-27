package Mastermind;

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

	public boolean playAgain()  {
		Boolean replay;
		char c ;
		do {
			System.out.println("Want to play again? Enter Y (yes) or N (no)");
//			String line = null;
			
			try {
//				line = new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).readLine();
				c = (char) System.in.read();
			} catch (Exception e) {
				return false;
			}
			System.out.println(c);
//			line = line.charAt(0);
			System.out.println(c == 'y');
			replay = c == 'y' || c == 'Y' || c == 'n' || c == 'N';
			System.out.println(replay);
		} while (!replay);

		return c == 'y' || c == 'Y';
	}

}
