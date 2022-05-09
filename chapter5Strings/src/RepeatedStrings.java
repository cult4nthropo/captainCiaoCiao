package src;

import java.util.Arrays;

public class RepeatedStrings {
	public static void main(String[] args) {
		
		System.out.println(checkForStringPattern("learn learn learn learn code learn learn learn learn code "));
			}
	
	public static String checkForStringPattern(String string) {
		
		if (string.length() < 2 || string == null) {
			return null;
		}
		//maximum length of the pattern is string.length()/2
		//all other lengths are possible
		String pattern = "";
		for (int length : lengthsOfSubstrings(string.length())) {
			pattern = string.substring(0, length);
			if (string.equals(pattern.repeat(string.length()/length))) {
				return pattern;
			}
		}
			
		return null;
	}
	
	//minor method to get all the possible substring lengths
	//takes the length of the string to be checked
	//checks, which possible length a repeated substring could have
	//returns the possible lengths of substrings as int[]
	public static int[] lengthsOfSubstrings (int length) {
		int [] dividers = new int [length / 2]; //takes the maximum length which could be possible
		int dividersIndex = 0; //counts the index of dividers, so we can return dividers with its real length
		
		for (int i = 1; i <= length / 2; i++) {
			if (length % i == 0) {
				dividers[dividersIndex++] = i;
			}
		}
		return Arrays.copyOf(dividers, dividersIndex);
	}

}
