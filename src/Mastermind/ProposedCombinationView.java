package Mastermind;

public class ProposedCombinationView extends Combination {
	String input;

	public ProposedCombinationView() {
		String line = "";
		String error;
		do {
			System.out.println("Colour Code : " + colourCode);
			SecretCombinationView.displayEncriptedCombination();
			System.out.print("Enter your guess : ");
			line = getInputLine();
			error = validateInput(line);
			if (!error.equals("OK")) {System.out.println(error);}
		}
		while (!error.equals("OK"));
		
		this.input = line.toLowerCase();
	}

	
	public String getPlayerInput() {
		return this.input;
	}

	private String getInputLine() {
		try {
			String line = new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).readLine();

			return line;
		} catch (Exception e) {
			return "";
		}
	}

	private String validateInput(String line) {
		line = line.toLowerCase();
		if (line.length() != 4)
			return "Must enter 4 letters";

		boolean[] choice = new boolean[colourNames.length];
		for (int i = 0; i < line.length(); i++) {
			char ch = line.charAt(i);
			int j = getColourIndex(ch);
			if (j == -1)
				return "Invalid Colour";
			choice[j] = true;
		}

		return "OK";
	}

}
