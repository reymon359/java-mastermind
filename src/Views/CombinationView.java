package Views;

public class CombinationView {
	static String[] colourNames = { "red", "blue", "yellow", "green", "orange", "purple" };
	static String colourCode = "rbygop";

	public int getColourIndex(char a) {
		return colourCode.indexOf(a);
	}

	public CombinationView() {

	}
}
