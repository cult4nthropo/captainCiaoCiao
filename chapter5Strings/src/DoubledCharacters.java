package src;

public class DoubledCharacters {

	public static void main(String[] args) {

		System.out.println(isEveryCharacterTwice("eehhrrwwüürrddiiggeerr$$CCaappttaaiinn"));
		System.out.println(isEveryCharacterTwice("ccapptttaaiinn"));
		System.out.println(isEveryCharacterTwice("222"));
		System.out.println(isEveryCharacterTwice(null));

	}
	
	public static int isEveryCharacterTwice(String message) {
		int returnCode = 0;
		char[] charactersOfMessage = message.toCharArray();
		
		if ( charactersOfMessage.length % 2 == 1) {
			return returnCode;
		} else {
			for (int i = 0; i < charactersOfMessage.length; i += 2) {
				if (charactersOfMessage[i] == charactersOfMessage[i+1]) {
					returnCode = 1;
				} else {
					returnCode = (i + 1) * -1;
					return returnCode;
				}
			}
		}
		return returnCode;
	}

}
