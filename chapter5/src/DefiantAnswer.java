package src;

import java.util.Scanner;

public class DefiantAnswer {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		findAnswers(scanner);
		

	}
	
	public static void findAnswers(Scanner scanner) {
			System.out.print("Your question:");
			String question = scanner.nextLine().trim();
			
			if (question.endsWith("?")) {
				if (question.equalsIgnoreCase("No idea?")) {
					System.out.println("Defiant Tony: Aye!");
				} else {
					System.out.println("Defiant Tony: " + question + "No Idea!");
				}
			} else {
				System.out.println("Defiant Tony: ...");
			}
	}

}
