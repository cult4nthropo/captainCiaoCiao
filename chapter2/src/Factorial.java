package chapter2.src;

import java.util.Scanner;

public class Factorial {
    public static void main (String [] args) {
    	try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("How many people does the crew have?");
			long numberOfPeople = scanner.nextLong();
			if (numberOfPeople < 0) {
			    System.out.println("The number can not be negative");
			}
			int i;
			long possibilities = 1;

			for (i = 1; i <= numberOfPeople; i++) {
			    possibilities *= i;
			}
			System.out.printf("There are %d possibilities to build a crew",possibilities);
			scanner.close();
		}
    	catch (NumberFormatException e) {
    		System.out.println("This probably was no number.");
    	}
    }
}
