package Mastermind;

public class SecretCombinationView extends Combination {
	String secretCode;
	
	public SecretCombinationView(String secretCode) {
		this.secretCode=secretCode;
	}

	public void displaySecretCombination() {
		String s = "[";
		for (int i = 0; i < 4; i++) {
			if (i != 0)
				s += ", ";
			s += Combination.colourNames[Combination.colourCode
					.indexOf(this.secretCode.charAt(i))];
		}
		s += "]";
		System.out.println(s);
	}
}