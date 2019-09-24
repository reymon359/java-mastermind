package Mastermind;

import java.util.ArrayList;

public class Game {

	private SecretCombination secretCombination;
	private ProposedCombinationView proposedCombinationView;
	private Result result;

	private GameView gameView;
//	public static ArrayList<String> previousResults = new ArrayList<String>();

	


	public void displaySolution() {
		String s = "[";
		for (int i = 0; i < 4; i++) {
			if (i != 0)
				s += ", ";
			s += Combination.colourNames[Combination.colourCode
					.indexOf(this.secretCombination.getSecretCombination().charAt(i))];
		}
		s += "]";
		System.out.println(s);
	}

	public void start() {
		this.secretCombination = new SecretCombination();
		this.gameView = new GameView();
		this.gameView.introduction();

		Result result;
		do {
			this.gameView.starView();
			result = new Result(
					this.gameView.getProposedCombinationView(), this.secretCombination.getSecretCombination() );
			this.gameView.previousResults.add(result.text);

		} while (!result.calculateScore() && this.gameView.previousResults.size() < 10);

		if (result.calculateScore()) {
			System.out.println("Good Job! The solution is : ");
		} else {
			System.out.println("GAME OVER! The solution was: ");
		}

		this.displaySolution();
	}

}
