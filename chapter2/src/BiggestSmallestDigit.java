package chapter2.src;

import java.util.Scanner;

public class BiggestSmallestDigit {
    public static void main (String [] args) {
    	try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Please enter a number");
			long number = scanner.nextLong();
			long max = 0;
			long min = number == 0 ? 0 : 9;

			for (Math.abs(number); number !=0; number /= 10) {
			    long lastDigit = number % 10;
			    max = Math.max(lastDigit, max);
			    min = Math.min(lastDigit, min);
			}
			System.out.printf("The smallest digit is %d %n The biggest digit is %d", min, max);
			scanner.close();
		}
    	catch(NumberFormatException e) {
        	System.out.println("This probably was no number.");
        }
    } 
}
