package Mastermind;

import java.util.ArrayList;

public class Result {
	String guess,secretCode,text;
	int deads, injureds;


	public Result(String guess, String secretCode) {
		this.guess = guess;
		this.secretCode = secretCode;
		this.calculateScore();
		this.displayResultText();
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

	public void displayResultText() {
		String s = "";

		this.text = "Guess " + (Mastermind.previousResults.size() + 1) + " : [";
		for (int i = 0; i < this.guess.length(); i++){
			if (i != 0) this.text += ", ";
			int j = Combination.colourCode.indexOf(this.guess.charAt(i));
			this.text += Combination.colourNames[j];
		}
		this.text += "] ";

		this.text += "Injureds: " + injureds + ", deads: " + deads;
		System.out.println(this.text);
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
