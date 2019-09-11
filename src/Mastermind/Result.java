package Mastermind;

public class Result {

	static int deads, injureds;
	
	static boolean calculateScore(String guess)	{
		deads = injureds = 0;
		for (int i = 0; i < guess.length(); i++) {
			char ch = guess.charAt(i);
			int j = SecretCombination.getSecretCombination().indexOf(ch);
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
			int j = Combination.colourCode.indexOf(guess.charAt(i));
			s += Combination.colourNames[j];
		}
		s += "]";

		s += " injured is " + injureds + "   dead is " + deads;

		System.out.println(s);
	}

	static void displaySolution() {
		System.out.println("Good Job! The solution is : ");
		 
		String s = "[";
		for (int i = 0; i < 4; i++) {
			if (i != 0) s += ", ";
			s += Combination.colourNames[ Combination.permutation[i] ];
		}
		s += "]";

		System.out.println(s);
	}

}
