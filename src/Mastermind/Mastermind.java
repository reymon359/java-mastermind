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
		game();
	}
}