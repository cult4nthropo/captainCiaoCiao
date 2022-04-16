package src;

import java.util.Scanner;

public class DiamondsForCiaoCiao {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("How big should your diamond be? Please enter an integer not bigger than 50: ");
			int width = scanner.nextInt();
			buildDiamond(width);
		} catch (IllegalArgumentException e) {
			System.out.println("This probably was no integer or bigger than 50.");
		}
	}
	
	public static void buildDiamond(int width) {
		if (width > 50) {
			throw new IllegalArgumentException();
		}
		int radius = width/2;
		for(int i = 0; i < width && radius > 0; i++) {
			
			int row = 65;
			System.out.print("\u0020".repeat(radius));
			printDiamondBody(width/2, row, i);
			radius--;
			System.out.println();
		}
		for (int i = width/2; i >= 0 && radius <= width/2; i--) {
			int row = 65;
			System.out.print("\u0020".repeat(radius));
			printDiamondBody(width/2, row, i);
			radius++;
			System.out.println();
		}
	}
	public static void printDiamondBody(int radius, int row, int index) {
		for ( int j = 0; j <= index; j++) {
			char diamondCharacter = (char) row;
			System.out.print(diamondCharacter);
			row++;
		}
		
		for (int j = index; j > 0 && row >= 65; j--) {
			char diamondCharacter = (char) (row -2);
			System.out.print(diamondCharacter);
			row--;
		}
	}
}
