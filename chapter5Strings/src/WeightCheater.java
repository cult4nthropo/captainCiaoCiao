package src;

public class WeightCheater {

	public static void main(String[] args) {

		System.out.println(cheatWeight(4123));
		System.out.println(cheatWeight(0));
		System.out.println(cheatWeight(1234));
		System.out.println(cheatWeight(22522));
		System.out.println(cheatWeight(936548731));

	}
	
	public static int cheatWeight(int weight) {
		if (weight < 0)
			throw new IllegalArgumentException("Weight can not be negative");
		
		char[] numbersToSwap = ("" + weight).toCharArray();
		char[] swappedNumbers = swapNumbers(numbersToSwap);
		StringBuilder sbNumbers = new StringBuilder();
		for(char character : swappedNumbers) {
			sbNumbers.append(character);
		}
		return Integer.parseInt(sbNumbers.toString());
	}
	
	public static char[] swapNumbers (char[] numbersToSwap) {
		char smallestDigit = numbersToSwap[0];
		char temp = numbersToSwap[0];
		
		for (int i = 1; i < numbersToSwap.length; i++) {
			if (numbersToSwap[i] != 0 && numbersToSwap[i] < smallestDigit) {
				smallestDigit = numbersToSwap[i];
				temp = numbersToSwap[0];
				numbersToSwap[0] = smallestDigit;
				numbersToSwap[i] = temp;
			}
		}
		return numbersToSwap;
	}
	
	

}
