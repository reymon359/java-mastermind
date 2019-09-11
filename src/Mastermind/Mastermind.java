package Mastermind;

public class Mastermind {

	static void introduction() {
		String s = "Welcome to Mastermind.\n"
				+ "You can guess the secret combination 10 times.\n"
				+ "Good luck!";
		System.out.println(s);
	}
	
	
	static void game() {
		new SecretCombination();
		introduction();
		String guess;
		do {
			guess = ProposedCombination.getPlayerGuess();
			Result.displayScore(guess);
        } while (!Result.calculateScore(guess));
		
		Result.displaySolution();
	}

	public static void main(String[] args) throws Exception {
		game();
	}
}