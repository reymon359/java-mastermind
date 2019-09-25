package Mastermind;

import java.util.ArrayList;

public class Game {

	private SecretCombination secretCombination;
	private ProposedCombinationView proposedCombinationView;
	private Result result;

	private GameView gameView;
	private static ArrayList<String> Results;

	public Game() {
		this.secretCombination = new SecretCombination();
		this.Results = new ArrayList<String>();
	}

	public void addResult(Result result) {
		this.Results.add(result.getResult());
	}


	public void start() {
		this.gameView = new GameView();
		this.gameView.introduction();

		Result result;
		do {
			this.gameView.displayPreviousResults(this.Results);
			
			result = new Result(
					this.gameView.getProposedCombinationView(), this.secretCombination.getSecretCombination() );
			this.addResult(result);
			

		} while (!result.calculateScore() && this.gameView.previousResults.size() < 10);

		if (result.calculateScore()) {
			System.out.println("Good Job! The solution is : ");
		} else {
			System.out.println("GAME OVER! The solution was: ");
		}

		this.gameView.displaySolution();
	}

}
