package Models;

public class Combination {

	public static String[] colourNames = { "red", "blue", "yellow", "green", "orange", "purple" };
	public static String colourCode = "rbygop";

	public int getColourIndex(char a) {
		return colourCode.indexOf(a);
	}

}
