package src;

import java.util.ArrayList;

public class Exercises {

	public static void main(String[] args) {
		System.out.println(isIsogram("Dermatoglyphics"));
		System.out.println(isIsogram("isogram"));
		System.out.println(isIsogram("aba"));
		System.out.println(isIsogram("thumbscrewjapingly"));
		System.out.println(isIsogram(""));

	}

	public static boolean isIsogram(String str) {
		char[] strArray = str.toLowerCase().toCharArray();
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (strArray[i] == strArray[j]) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static int countDuplicates(String text) {
		char[] textArray = text.toLowerCase().toCharArray();
		ArrayList <Character> duplicates = new ArrayList<>();
		for (int i = 0; i < textArray.length; i++) {
			for (int j = i + 1; j < textArray.length; j++) {
				if ((textArray[i] == textArray[j]) && !duplicates.contains(textArray[i])) {
					duplicates.add(textArray[i]);
				}
			}
		}
		return duplicates.size();
	}

}
