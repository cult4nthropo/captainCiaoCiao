package chapter2.src;

import java.util.Scanner;

public class SimpleChessBoard {
    public static void main (String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Wie breit soll das Feld sein?");
			int width = scanner.nextInt();
			System.out.println("Wie hoch soll das Feld sein=");
			int height = scanner.nextInt();
			for (int i = 0; i < height; i++) {
			    for (int j = 0; j < width; j++) {
			        System.out.print((i + j) % 2 == 1 ? "#" : "_");
			        }
			    System.out.println();
			    }
		}
        catch (NumberFormatException e) {
        	System.out.println("This was no number");
        }

        } 
}
