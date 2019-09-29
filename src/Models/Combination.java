package Models;

public class Combination {

	protected String[] colourNames = { "red", "blue", "yellow", "green", "orange", "purple" };
	protected static String colourCode = "rbygop";

	public int getColourIndex(char a) {
		return colourCode.indexOf(a);
	}

}
