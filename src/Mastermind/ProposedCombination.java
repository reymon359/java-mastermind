package Mastermind;

public class ProposedCombination extends Combination {
	private String guess;
	private ProposedCombinationView proposedCombinationView;
	
    public ProposedCombination() {
    	this.proposedCombinationView = new ProposedCombinationView();
    	this.guess = this.proposedCombinationView.getPlayerInput();
    	
//    	this.guess = new ProposedCombinationView().getPlayerInput(); Maybe this way??
    }
    
	public String getPlayerGuess() {
		return this.guess;
	}
	

}
