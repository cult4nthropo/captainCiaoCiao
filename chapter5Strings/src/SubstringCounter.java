package src;

public class SubstringCounter {

	public static void main(String[] args) {
		System.out.println(countMatches(null, "Whatever"));
		System.out.println(countMatches("", "whatever"));
		System.out.println(countMatches("abba", null));
		System.out.println(countMatches("abba", ""));
		System.out.println(countMatches("abba", "a"));
		System.out.println(countMatches("aaaa", "aa"));
		System.out.println(countMatches("abba", "ab"));
		System.out.println(countMatches("abba", "xxx"));

	}
	
	public static int countMatches(String string, String substring) {
		
		if(string == null || substring == null || string == "" || substring == "") {
			return -1;
		}

		return string.split(substring, -1).length-1;
	}
	
	//the solution provided in Captain CiaoCiao
	public static int countMatches2(String string, String substring) {
		if(string == null || substring == null || string == "" || substring == "") {
			return -1;
		}
		int matchCounter = 0;
		
		for(int i = 0; (i = string.indexOf(substring, i)) != -1; i += substring.length()) {
			matchCounter++;
		}
		return matchCounter;
	}

}
