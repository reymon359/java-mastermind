package Mastermind;

import java.util.ArrayList;

public class Result {
	String guess;
	String secretCode;
	int deads, injureds;


	public Result(String guess, String secretCode) {
		this.guess = guess;
		this.secretCode = secretCode;
		this.calculateScore();
		this.displayResult();
	}

	public boolean calculateScore()	{
		deads = injureds = 0;
		for (int i = 0; i < this.guess.length(); i++) {
			char ch = this.guess.charAt(i);
			int j = this.secretCode.indexOf(ch);
			if (i == j) deads++;
			if (j >= 0) injureds++;
		}
		boolean success = false;
		if ( deads == this.guess.length()) success = true;
		return success;
	}

	public void displayResult() {
		String s = "";

		s = "Guess " + (Mastermind.previousResults.size() + 1) + " : [";
		for (int i = 0; i < this.guess.length(); i++){
			if (i != 0) s += ", ";
			int j = Combination.colourCode.indexOf(this.guess.charAt(i));
			s += Combination.colourNames[j];
		}
		s += "] ";

		s += "Injureds: " + injureds + ", deads: " + deads;
		this.previousResults.add(s);
		System.out.println(s);
	}

	public void displaySolution() {
		String s = "[";
		for (int i = 0; i < 4; i++) {
			if (i != 0) s += ", ";
			s += Combination.colourNames[ Combination.permutation[i] ];
		}
		s += "]";

		System.out.println(s);
	}



}
