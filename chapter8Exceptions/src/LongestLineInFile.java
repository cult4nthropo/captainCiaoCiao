package src;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class LongestLineInFile {

	public static void main(String[] args) {

		String filename = "chapter8Exceptions\\family-names.txt";
		List<String> lines = null;
		try {
			lines = Files.readAllLines(Paths.get(filename));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		String longestName = "";
		String secondLongestName = "";
		
		for(String line : lines) {
			if (line.length() > longestName.length()) {
				longestName = line;
			} else if (line.length() > secondLongestName.length()) {
				secondLongestName = line;
			}
		}
		System.out.println(longestName);
		System.out.println(secondLongestName);

	}

}
