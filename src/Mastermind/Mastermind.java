package Mastermind;

import java.util.ArrayList;

public class Mastermind {

	private SecretCombination secretCombination;

	public ArrayList<String> previousResults = new ArrayList<String>();

	
	void introduction() {
		String s = "Welcome to Mastermind.\n"
				+ "You can guess the secret combination 10 times.\n"
				+ "Good luck!";
		System.out.println(s);
	}

	public void displayPreviousResults() {
		if (this.previousResults.size() == 0) return;

		String s = "The previous results are: \n";
		for (int i = 0; i < this.previousResults.size(); i++) {
			s += this.previousResults.get(i) + "\n";
		}

		System.out.println(s);
	}

	void game() {
		this.secretCombination = new SecretCombination();
		this.introduction();
		String guess;
		do {
			this.displayPreviousResults();
			guess = ProposedCombination.getPlayerGuess();
			Result.calculateScore(guess);
			Result.displayScore(guess);
			if ( Result.previousResults.size() == 10) { 
				System.out.println("GAME OVER! The solution was: ");
				break;
			}
        } while (!Result.calculateScore(guess));
		
		if ( Result.calculateScore(guess)) System.out.println("Good Job! The solution is : ");
		Result.displaySolution();
	}


	
	public static void main(String[] args) throws Exception {
		new Mastermind().game();
	}
}