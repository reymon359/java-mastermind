package Mastermind;

public class Result {
    public String guess, secretCode, text;
    public int dead, injured;
    
    public Result(String guess, String secretCode) {

        this.guess = guess;
        this.secretCode = secretCode;
        this.calculateScore();
       new ResultView(this).displayResultText();
    }

    public boolean calculateScore() {
        this.dead = this.injured = 0;
        for (int i = 0; i < this.guess.length(); i++) {
            char ch = this.guess.charAt(i);
            int j = this.secretCode.indexOf(ch);
            if (i == j) this.dead++;
            if (j >= 0) injured++;
        }
        return this.dead == this.guess.length();
    }



}
