package Mastermind;

import java.util.ArrayList;

public class GameView {

	private ResultView resultView;
	private SecretCombinationView secretCombinationView;
	private ProposedCombinationView proposedCombinationView;
	
	public static ArrayList<String> previousResults = new ArrayList<String>();
	
	public GameView(){
		
	}
	
	public void introduction() {
		String s = "Welcome to Mastermind.\n" + "You can guess the secret combination 10 times. Good luck!";
		System.out.println(s);
	}
	private void displayPreviousResults() {
		if (this.previousResults.size() == 0)
			return;

		String s = "The previous results are: \n";
		for (int i = 0; i < this.previousResults.size(); i++) {
			s += this.previousResults.get(i) + "\n";
		}

		System.out.println(s);
	}
	
	public void starView() {
		this.displayPreviousResults();
		this.proposedCombinationView = new ProposedCombinationView();
		
	}
	
	  public String getProposedCombinationView() {
			return this.proposedCombinationView.guess;
		}
}
