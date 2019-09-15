package Mastermind;

import java.util.Random;

public class SecretCombination extends Combination {
	public String secretCode = "";
	
	public SecretCombination() {

		String colourCodeAux = colourCode;
		for (int i = 0; i < 4; i++) {
			int result = new Random().nextInt(6) - 1;
			this.secretCode = this.secretCode + colourCodeAux.charAt(result);
			colourCodeAux = colourCodeAux.substring(0, colourCode.charAt(result))
		}

				colourCode
		System.out.println(result);
		//  Knuth Shuffling algorithm to randomize the permutation array
		for (int i = 0; i < permutation.length; i++) {
			int random = (int) (Math.random() * permutation.length);
			int t = permutation[i];
			permutation[i] = permutation[random];
			permutation[random] = t;
		}

		this.secretCode = "";
		for (int i = 0; i < 4; i++) {
			this.secretCode += colourCode.charAt( permutation[i] );
		} 
		
	}
}