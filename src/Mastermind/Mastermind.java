package Mastermind;

public class Mastermind {

  // Combinaciones
	
  static void game() {
	  
	new SecretCombination();
	
	// Start loop
	  
    boolean success = false;
    while (!success) {
      String guess = ProposedCombination.getPlayerGuess();
      success = Result.calculateScore(guess);
      Result.displayScore(guess);
    }
    System.out.println("Good Job! The solution is : ");
    displaySolution();
  }
 
  public static void main(String[] args) throws Exception {
        
        game();
  }
}