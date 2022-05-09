package src;

public class PalindromeTester {

	public static void main(String[] args) {
		System.out.println(isPalindrome("otto"));
		System.out.println(isPalindrome("What"));

	}
	
	public static boolean isPalindrome(String word) {
		String reversedWord = new StringBuilder(word).reverse().toString();
		if(reversedWord.equalsIgnoreCase(word)) {
			return true;
		}
		return false;
	}

}
