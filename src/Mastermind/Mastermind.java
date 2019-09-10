package Mastermind;

public class Mastermind {

	static String[] colourNames = {"red", "blue", "yellow", "green", "orange", "purple"};

	static int[] permutation = {0,1,2,3,4,5};

	static String colourCode = "rbygop";  

	static String secretCode = "abcd"; 



  static String getPlayerGuess() {
    return "ABCD";  
  }
 
  static boolean calculateScore(String guess) {
    return true;
  }
 
  static void displayScore(String guess) {
  }
 
  static void displaySolution() {
    String s = "[";
    for (int i = 0; i < 4; i++) {
      if (i != 0) s += ", ";
      s += colourNames[ permutation[i] ];
    }
    s += "]";
   
    System.out.println(s);
  }
 
  static void setDifficulty() {
  }
 
  //  Knuth Shuffling algorithm to randomize the permutation array
  static void shuffle() {
    for (int i = 0; i < permutation.length; i++) {
      int random = (int) (Math.random() * permutation.length);
      int t = permutation[i];
      permutation[i] = permutation[random];
      permutation[random] = t;
    }
   
    secretCode = "";
    for (int i = 0; i < 4; i++) {
      secretCode += colourCode.charAt( permutation[i] );
    }
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