package chapter2.src;

import java.util.Scanner;

public class SingularOrPlural {
    public static void main(String[]args) {
    	try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("How many bottles of rum do we have Captain?");
			int noOfBottles = scanner.nextInt();
			boolean plural = (noOfBottles != 1);
			System.out.printf("%d bottle%s of rum", noOfBottles, plural ? "s" : "");
		}catch(NumberFormatException e) {
			System.out.println("This was no number");
		}
    }
}
