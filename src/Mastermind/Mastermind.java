package Mastermind;

public class Mastermind {

	static String[] colourNames = {"red", "blue", "yellow", "green", "orange", "purple"};

	static int[] permutation = {0,1,2,3,4,5};

	static String colourCode = "rbygop";  

	static String secretCode = "abcd"; 
	
	static int deads, injureds; 


	static String getPlayerGuess() {
	  boolean inputDone=false;
	  String line="";
	  while (!inputDone) {
	    System.out.println("Colour Code : "+ colourCode);
	    System.out.print("Enter your guess : ");
	    line = getInputLine();
	    String error = validateInput(line);
	    if (error.equals("OK"))
	      inputDone=true;
	    else
	      System.out.println(error);
	  }
	  return line.toLowerCase();
	}
 
	static String getInputLine() {
	  try {
	    String line = new java.io.BufferedReader(
	      new java.io.InputStreamReader(System.in)
	    ).readLine();
	 
	    return line;
	  } 
	  catch (Exception e) {
	    return "";
	  }
	} 
	
	static String validateInput(String line) {
	  line = line.toLowerCase();
	  if (line.length()!=4) return "Must enter 4 letters";
	 
	  boolean[] choice=new boolean[colourNames.length];
	  for (int i=0;i<line.length();i++)
	  {
	    char ch=line.charAt(i);
	    int j=getColourIndex(ch);
	    if (j==-1) return "Invalid Colour";
	    choice[j]=true;
	  }
	   
	  return "OK";
	}
	
	static int getColourIndex(char a) {
	  return colourCode.indexOf(a);
	}

	


	static boolean calculateScore(String guess)	{
		deads = injureds = 0;
		for (int i = 0; i < guess.length(); i++) {
			char ch = guess.charAt(i);
			int j = secretCode.indexOf(ch);
			if (i == j) deads++;
			if (j >= 0) injureds++;
		}
		boolean success=false;
		if ( deads==4) success=true;
		return success;
	}

	static void displayScore(String guess) {
		String s = "";

		s = "Guess: [";
		for (int i = 0; i < guess.length(); i++){
			if (i!=0) s += ", ";
			int j = colourCode.indexOf(guess.charAt(i));
			s += colourNames[j];
		}
		s += "]";

		s += " injured is " + injureds + "   dead is " + deads;


		System.out.println(s);
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
 
  static void game() {
    boolean success = false;
    while (!success) {
      String guess = getPlayerGuess();
      success = calculateScore(guess);
      displayScore(guess);
    }
    System.out.println("Good Job! The solution is : ");
    displaySolution();
  }
 
  public static void main(String[] args) throws Exception {
  
      shuffle();
      game();
   
  }
}