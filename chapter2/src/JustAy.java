package chapter2.src;

import java.util.Scanner;

public class JustAy {
    public static void main (String[]args) {
    	try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Anything to tell?");
			String justYes = scanner.nextLine();

			if (justYes.equals("Ay") || justYes.equals("Ay, ay") || justYes.equals("Ein Ei") || justYes.equals("Yes")) {
			    System.out.println("Keep it up!");
			} else {
			    System.out.println("Don't you dare!");
			}
		} catch (NumberFormatException e) {
			System.out.println("This was no number");
		}
    }
}
