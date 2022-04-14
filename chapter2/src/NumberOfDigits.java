package chapter2.src;

import java.util.Scanner;

public class NumberOfDigits {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Bitte eine Ganzzahl eingeben: ");
			int number = scanner.nextInt();
			int digits = 1;

			for (int i = 1; digits <= 10; i*=10) {
			    if (number/i > 1) {
			        digits++;
			    } else {
			        System.out.printf("Die Zahl %d hat %d Stellen", number, digits);
			        break;
			    }
			}
		} catch (NumberFormatException e) {
			System.out.println("This was no number");
		}
    }
}
