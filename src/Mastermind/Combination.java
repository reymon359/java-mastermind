package Mastermind;

public class Combination {

	public String[] colourNames = {"red", "blue", "yellow", "green", "orange", "purple"};

	public int[] permutation = {0,1,2,3,4,5};

	public String colourCode = "rbygop";


	public int getColourIndex(char a) {
		return colourCode.indexOf(a);
	}

}
