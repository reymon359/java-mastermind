package Models;

import java.util.Random;

public class SecretCombination extends Combination {
	private String secretCode = "";

	public SecretCombination() {
		String colourCodeAux = colourCode;

		for (int i = 0; i < 4; i++) {
			Random r = new Random();
			int result = r.nextInt(colourCodeAux.length());
			this.secretCode = this.secretCode + colourCodeAux.charAt(result);
			colourCodeAux = colourCodeAux.substring(0, colourCodeAux.indexOf(colourCodeAux.charAt(result)))
					+ colourCodeAux.substring(colourCodeAux.indexOf(colourCodeAux.charAt(result)) + 1);
		}
	}

	public String getSecretCode() {
		return this.secretCode;
	}
	
}