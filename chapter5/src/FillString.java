package src;

public class FillString {

	public static void main(String[] args) {
		System.out.println(mix("We're out of rum!", "-"));
		System.out.println(mix("Blimey!", "\uD83D\uDC7B"));
		System.out.println(mix("\uD83D\uDC7B", "\uD83D\uDC7B"));
		System.out.println(mix("", "\uD83D\uDC7B"));
		

	}
	
	public static String mix(String text, String fillString) {
		String mixedMessage = "";
		
		if (text == null) {
			return mixedMessage;
		} else if (fillString == null) {
			mixedMessage = text;
		} else if (text.equals(fillString)) {
			mixedMessage = text;
		} else {
			char[] textCharacters = text.toCharArray();
			
			for (char character : textCharacters) {
				mixedMessage += character + fillString;
			}
		}
		return mixedMessage;
	}

}
