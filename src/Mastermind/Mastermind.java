package Mastermind;

import java.util.ArrayList;

public class Mastermind {

    private SecretCombination secretCombination;
    private ProposedCombination proposedCombination;

    static ArrayList<String> previousResults = new ArrayList<String>();


    void introduction() {
        String s = "Welcome to Mastermind.\n"
                + "You can guess the secret combination 10 times.\n"
                + "Good luck!";
        System.out.println(s);
    }

    public void displayPreviousResults() {
        if (this.previousResults.size() == 0) return;

        String s = "The previous results are: \n";
        for (int i = 0; i < this.previousResults.size(); i++) {
            s += this.previousResults.get(i) + "\n";
        }

        System.out.println(s);
    }

    void game() {
        this.secretCombination = new SecretCombination();
        this.introduction();
        Result result;
        do {
            this.displayPreviousResults();
            this.proposedCombination = new ProposedCombination();
            result = new Result(this.proposedCombination.guess, this.secretCombination.secretCode);
            this.previousResults.add(result.text);

            if (this.previousResults.size() == 10) {
                System.out.println("GAME OVER! The solution was: ");
                break;
            }
        } while (!result.calculateScore());

        if (result.calculateScore()) System.out.println("Good Job! The solution is : ");
        result.displaySolution();
    }


    public static void main(String[] args) {
        new Mastermind().game();
    }
}