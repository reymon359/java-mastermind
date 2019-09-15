package Mastermind;

public class Combination {

	static String[] colourNames = {"red", "blue", "yellow", "green", "orange", "purple"};

	static int[] permutation = {0,1,2,3,4,5};

	static String colourCode = "rbygop";


	static int getColourIndex(char a) {
		return colourCode.indexOf(a);
	}

}
