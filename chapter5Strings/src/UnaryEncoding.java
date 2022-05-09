package src;

public class UnaryEncoding {

	public static void main(String[] args) {

		System.out.println(encodeFromDecimalToBinary(0, 8, 15));

	}
	
	public static String encodeFromDecimalToBinary(int...values) {
		StringBuilder binaryCoding = new StringBuilder();
		
		for (int value : values) {
			if (value < 0) {
				throw new IllegalArgumentException("");
				}
			binaryCoding.append(Integer.toBinaryString(value));
		}
		
		return binaryCoding.toString();
	}

}
