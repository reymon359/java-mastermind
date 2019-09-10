package Mastermind;

public class Mastermind {
 
  static String getPlayerGuess() {
    return "ABCD";  
  }
 
  static boolean calculateScore(String guess) {
    return true;
  }
 
  static void displayScore(String guess) {
  }
 
  static void displaySolution() {
  }
 
  static void setDifficulty() {
  }
 
  static void shuffle() {
  }
 
  static boolean replay() {
    return false;  
  }
 
  static void game() {
    boolean success=false;
    while (!success) {
      String guess=getPlayerGuess();
      success=calculateScore(guess);
      displayScore(guess);
    }
    System.out.println("The solution is : ");
    displaySolution();
  }
 
  public static void main(String[] args) throws Exception {
    while (true) {
      setDifficulty();
      shuffle();
      game();
      if (!replay()) break;
    }
  }
}