package src;

public class cesarEncryption {

	public static void main(String[] args) {

		System.out.println(encryptLikeCesar("I really love to learn", 4));
		System.out.println(decodeCesar("M vieppd pszi xs pievr", 4));

	}
	
	public static String encryptLikeCesar(String string, int key) {
		//ignored ä, ö, ü and punctuation 
		//Range for capitals 65-90
		//Range for small letters 97-122
		//if the encryption meets the upper boundery, it begins at a/a again
		StringBuilder encrypted = new StringBuilder();
		char[] messageCharacters = string.toCharArray();
		
		for (char character : messageCharacters) {
			if (character == ' ') {
				encrypted.append(' ');
			}
			//Capitals
			if (character <= 122 && character >= 97) {
				if (character + key > 122) {
					character = (char)(97 + ((int)character + key - 122));
					encrypted.append(character);
				} else {
					character += key;
					encrypted.append(character);
				}
				//small letters
			} else if (character <= 90 && character >= 65) {
				if (character + key > 90) {
					character = (char)(65 + ((int)character + key - 90));
					encrypted.append(character);
				} else {
					character += key;
					encrypted.append(character);
				}
			}
		}

		String encryptedString = encrypted.toString();
		return encryptedString;
	}
	
	public static String decodeCesar (String string, int key) {
		StringBuilder decrypted = new StringBuilder();
		char[] messageCharacters = string.toCharArray();
		
		for (char character : messageCharacters) {
			if (character == ' ') {
				decrypted.append(' ');
			}
			if (character <= 122 && character >= 97) {
				if (character - key < 97) {
					character = (char)(((int)character - key + 122 - 97));
					decrypted.append(character);
				} else {
					character -= key;
					decrypted.append(character);
				}
			} else if (character <= 90 && character >= 65) {
				if (character - key < 65) {
					character = (char)(((int)character - key + 90 - 65));
					decrypted.append(character);
				} else {
					character -= key;
					decrypted.append(character);
				}
			}
		}
		String decryptedString = decrypted.toString();
		return decryptedString;
	}

}
