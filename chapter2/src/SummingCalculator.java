package chapter2.src;

import java.util.Scanner;

public class SummingCalculator {
    public static void main (String [] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			int prize;
			int loot = 0;
			do {
			    prize = scanner.nextInt();
			    loot += prize;
			}while (prize != 0);
			System.out.printf("Sum: %d", loot);
		}catch(NumberFormatException e) {
			System.out.println("This was no number");
		}
    }
}
