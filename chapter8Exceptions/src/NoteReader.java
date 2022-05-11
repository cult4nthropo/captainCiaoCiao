package src;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

public class NoteReader {

	public static void main(String[] args) {
		readFile();
		writeFile();

	}

	public static String readFile() {
		StringBuilder redFile = new StringBuilder();
		try (Scanner scanner = new Scanner(Paths.get("chapter8Exceptions\\file.txt"))) {
			while (scanner.hasNextLine()) {
				String nextLine = scanner.nextLine();
				String validNotes = "A, B, C, D, E, F, G, A B C D E F G a b c d e f g a' b' c' d' e' f' g'";
				if (!nextLine.isEmpty() && validNotes.contains(nextLine)) {
					redFile.append(nextLine + " ");
				}
			}
		} catch (IOException e) {
			System.out.println("This file does not exist.");
			e.printStackTrace();
		}
		return redFile.toString();
	}
	
	public static void writeFile() {
		String fileName = "chapter8Exceptions\\noteFile.txt";

		try (PrintWriter printWriter = new PrintWriter(fileName)) {
			printWriter.write(readFile());;
		} catch (FileNotFoundException e) {
			System.err.printf("%s could not be created.", fileName);
		}
	}

}
