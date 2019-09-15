package Mastermind;

public class SecretCombination extends Combination {
	public String secretCode = "abcd";
	
	public SecretCombination() {
		//  Knuth Shuffling algorithm to randomize the permutation array
		for (int i = 0; i < permutation.length; i++) {
			int random = (int) (Math.random() * permutation.length);
			int t = permutation[i];
			permutation[i] = permutation[random];
			permutation[random] = t;
		}

		secretCode = "";
		for (int i = 0; i < 4; i++) {
			secretCode += colourCode.charAt( permutation[i] );
		} 
		
	}

//	public String getSecretCombination(){
//		return secretCode;
//	}


}