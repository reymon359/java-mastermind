package Models;

import Models.Combination;
import Views.ProposedCombinationView;

public class ProposedCombination extends Combination {
	private String guess;

	public ProposedCombination() {
		this.guess = new ProposedCombinationView().getPlayerInput();
	}

	public String getPlayerGuess() {
		return this.guess;
	}

}
