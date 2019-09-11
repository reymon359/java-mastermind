package Mastermind;

public class ProposedCombination extends Combination {

	static String getPlayerGuess() {
		boolean inputDone=false;
		String line="";
		while (!inputDone) {
			System.out.println("Colour Code : "+ colourCode);
			System.out.print("Enter your guess : ");
			line = getInputLine();
			String error = validateInput(line);
			if (error.equals("OK"))
				inputDone =true;
			else
				System.out.println(error);
		}
		return line.toLowerCase();
	}

	static String getInputLine() {
		try {
			String line = new java.io.BufferedReader(
					new java.io.InputStreamReader(System.in)
					).readLine();

			return line;
		} 
		catch (Exception e) {
			return "";
		}
	} 

	static String validateInput(String line) {
		line = line.toLowerCase();
		if (line.length()!=4) return "Must enter 4 letters";

		boolean[] choice=new boolean[colourNames.length];
		for (int i=0;i<line.length();i++)
		{
			char ch=line.charAt(i);
			int j = getColourIndex(ch);
			if (j==-1) return "Invalid Colour";
			choice[j]=true;
		}

		return "OK";
	}

	static int getColourIndex(char a) {
		return colourCode.indexOf(a);
	}
}
