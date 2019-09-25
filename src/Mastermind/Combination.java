package Mastermind;

public class Combination {

    static String[] colourNames = {"red", "blue", "yellow", "green", "orange", "purple"};
    static String colourCode = "rbygop";

    
    
    public int getColourIndex(char a) {
        return colourCode.indexOf(a);
    }

}
