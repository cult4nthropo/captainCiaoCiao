package src;

public class VowelRemover {

	public static void main(String[] args) {

		removeVowels("The big äh brown fox jumps öh over the lazy dog üh.");
	}
	
	public static void removeVowels(String string) {
		String vowelPattern = "[aAeEiIoOuUäÄöÖüÜ]";
		String newString = string.replaceAll(vowelPattern, "");
		System.out.println(newString);
	}

}
