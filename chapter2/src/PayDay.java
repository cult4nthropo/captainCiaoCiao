package chapter2.src;

import java.util.Scanner;

public class PayDay {
    public static void main (String[]args){
    	try (Scanner scanner = new Scanner(System.in)) {
			int payed = scanner.nextInt();
			int debt = 1_000;
			double lowerLimit = 0.1 * debt;
			double upperLimit = 1.2 * debt;

			System.out.printf("%s", (payed < lowerLimit || payed > upperLimit) ? "You son of a bi***!" : "Good boy");
		}catch (NumberFormatException e) {
			System.out.println("This was no number");
		}
    }
}
