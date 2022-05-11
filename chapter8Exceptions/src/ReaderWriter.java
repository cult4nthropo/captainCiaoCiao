package src;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

public class ReaderWriter {

	public static void main(String[] args) {
		readAndWriteFile();

	}

	public static String readAndWriteFile() {
		String source = "chapter8Exceptions\\file.txt";
		String target = "chapter8Exceptions\\noteFile.txt";
		StringBuilder redFile = new StringBuilder();
		try (Scanner scanner = new Scanner(Paths.get(source)); PrintWriter printWriter = new PrintWriter(target)) {
			while (scanner.hasNextLine()) {
				String nextLine = scanner.nextLine();
				String validNotes = "A, B, C, D, E, F, G, A B C D E F G a b c d e f g a' b' c' d' e' f' g'";
				if (!nextLine.isEmpty() && validNotes.contains(nextLine)) {
					redFile.append(nextLine + " ");
				}
			}
			printWriter.write(redFile.toString());
		} catch (FileNotFoundException e) {
			System.err.printf("%s could not be created.", target);
		} catch (IOException e) {
			System.err.println("This file does not exist.");
			e.printStackTrace();
		}
		return redFile.toString();
	}
}
