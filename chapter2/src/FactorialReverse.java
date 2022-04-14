package chapter2.src;

import java.util.Scanner;

public class FactorialReverse {
    public static void main (String [] args) {
    	try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Just give me a number and I tell you if it is a factorial.");

			long numberToCheck = scanner.nextLong();
			long number = numberToCheck;
			int i;

			for (i = 1; (number % i) == 0; i++){
			    number /= i;
			}
			if ( number == 1 ) {
			    System.out.printf("%d = %d!", numberToCheck, i-1);
			} else {
			    System.out.printf("%d is not a factorial", numberToCheck);
			}
			scanner.close();
		} catch (NumberFormatException e) {
			System.out.println("This was no number");
		}
    }
}
