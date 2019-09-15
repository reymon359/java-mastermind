package Mastermind;

public class Result {
    String guess, secretCode, text;
    private int dead, injured;


    public Result(String guess, String secretCode) {
		this.dead = this.injured = 0;
        this.guess = guess;
        this.secretCode = secretCode;
        this.calculateScore();
        this.displayResultText();
    }

    public boolean calculateScore() {
        for (int i = 0; i < this.guess.length(); i++) {
            char ch = this.guess.charAt(i);
            int j = this.secretCode.indexOf(ch);
            if (i == j) this.dead++;
            if (j >= 0) injured++;
        }
        boolean success = false;
        if (this.dead == this.guess.length()) success = true;
        return success;
    }

    public void displayResultText() {
        String s = "";

        this.text = "Guess " + (Mastermind.previousResults.size() + 1) + " : [";
        for (int i = 0; i < this.guess.length(); i++) {
            if (i != 0) this.text += ", ";
            int j = Combination.colourCode.indexOf(this.guess.charAt(i));
            this.text += Combination.colourNames[j];
        }
        this.text += "] ";

        this.text += "Injureds: " + injured + ", deads: " + dead;
        System.out.println(this.text);
    }

    public void displaySolution() {
        String s = "[";
        for (int i = 0; i < 4; i++) {
            if (i != 0) s += ", ";
            s += Combination.colourNames[Combination.colourCode.indexOf(secretCode.charAt(i))];
        }
        s += "]";
        System.out.println(s);
    }


}
