package Mastermind;

public class ResultView {

	Result result;

	public ResultView(Result result) {
		this.result = result;

	}

	public void displayResultText() {
		String s = "";

		this.result.text = "Guess " + (Game.previousResults.size() + 1) + " : [";
		for (int i = 0; i < this.result.guess.length(); i++) {
			if (i != 0)
				this.result.text += ", ";
			int j = Combination.colourCode.indexOf(this.result.guess.charAt(i));
			this.result.text += Combination.colourNames[j];
		}
		this.result.text += "] ";

		this.result.text += "Injureds: " + this.result.injured + ", deads: " + result.dead;
		System.out.println(this.result.text);
	}

}
