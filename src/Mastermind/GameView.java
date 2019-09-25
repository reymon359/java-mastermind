package Mastermind;

import java.util.ArrayList;

public class GameView {

	private ResultView resultView;
	private SecretCombinationView secretCombinationView;
	private ProposedCombinationView proposedCombinationView;

	public static ArrayList<String> previousResults = new ArrayList<String>();

	public GameView() {
		this.proposedCombinationView = new ProposedCombinationView();
	}

	public void introduction() {
		System.out.println("Welcome to Mastermind.\n" + "You can guess the secret combination 10 times. Good luck!");
	}

	public void displayPreviousResults(ArrayList<String> results) {
		String s = "The previous results are: \n";
		for (int i = 0; i < results.size(); i++) {
			s += results.get(i) + "\n";
		}

		System.out.println(s);
	}

	public String getProposedCombinationView() {
		return this.proposedCombinationView.getPlayerGuess();
	}

	public void displaySolution() {
		this.secretCombinationView.displaySecretCombination();
	}
}
