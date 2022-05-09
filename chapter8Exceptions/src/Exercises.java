package src;

public class Exercises {

	public static void main(String[] args) {
		int[] numbers = parseInts("1", "2", "3");
		for (int number : numbers) {
			System.out.println(number);
		}
	}

	static int[] parseInts(String... numbers) {
		int[] intArray = new int[numbers.length];
		for (int i = 0; i < intArray.length; i++) {
			try {
				intArray[i] = Integer.parseInt(numbers[i]);
			} catch (NumberFormatException e) {
				/*
				System.out.println("This cannot be converted to an integer");
				e.printStackTrace();
				*/
				intArray[i] = 0;
			}
		}
		return intArray;
	}

}
