package Mastermind;

import java.util.ArrayList;

public class Game {

	private SecretCombination secretCombination;
	private ProposedCombination proposedCombination;
	private Result result;
	private ArrayList<String> resultTexts;

	public Game() {
		this.secretCombination = new SecretCombination();
		this.resultTexts = new ArrayList<String>();
	}

	public void addResultText(String resultText) {
		this.resultTexts.add(resultText);
	}

	public void play() {
		do {
			this.proposedCombination = new ProposedCombination();
			this.result = new Result(this.proposedCombination.getPlayerGuess(), this.secretCombination.getSecretCode());
			this.result.displayResultText();
			this.addResultText(this.result.getResultText());
			GameView.displayResultsTexts(this.resultTexts);

		} while (!this.result.checkWin() && this.resultTexts.size() < 2);

	}

	public void endGame() {
		if (this.result.checkWin()) {
			System.out.println("Good Job! The solution is : ");
		} else {
			System.out.println("GAME OVER! The solution was: ");
		}
	}

	public SecretCombination getSecretCombination() {
		return this.secretCombination;
	}

}
