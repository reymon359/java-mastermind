package Mastermind;

import java.util.ArrayList;

public class Game {

	private SecretCombination secretCombination;
	private ProposedCombination proposedCombination;
	private Result result;

//	private GameView gameView;
	private ArrayList<String> results;

	public Game() {
		this.secretCombination = new SecretCombination();
		this.results = new ArrayList<String>();
	}

	public void addResult(Result result) {
		this.results.add(result.getResult());
	}

	public void play() {
//		Result result;
		do {
			this.proposedCombination = new ProposedCombination();
			this.result = new Result(this.proposedCombination.getPlayerGuess(), this.secretCombination.getSecretCode());
			this.addResult(this.result);
			GameView.displayResults(this.results);
			
		} while (!this.result.calculateScore() && this.results.size() < 10);

	}

	public void checkWin() {
		if (this.result.calculateScore()) {
			System.out.println("Good Job! The solution is : ");
		} else {
			System.out.println("GAME OVER! The solution was: ");
		}
	}
	
	public SecretCombination getSecretCombination() {
		return this.secretCombination;
	}

}
