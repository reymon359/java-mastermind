package Mastermind;

public class Mastermind {

	static void game() {
		new SecretCombination();

		boolean success = false;
		while (!success) {
			String guess = ProposedCombination.getPlayerGuess();
			success = Result.calculateScore(guess);
			Result.displayScore(guess);
		}
		Result.displaySolution();
	}

	public static void main(String[] args) throws Exception {
		game();
	}
}