package src;

public class Textmarker {

	public static void main(String[] args) {

		String sentence = "There is more treasure in books than in all the pirates' loot on Treasure Island.";
		
		underlineWords(sentence, "treasure");

	}
	
	public static void underlineWords(String string, String importantWord) {
		if (string == null || string.isEmpty()) {
			System.out.println("There is no text...");
		} else if (!string.contains(importantWord) || importantWord.isEmpty() || importantWord == null)	{
			System.out.println(string);
			} else {
				String[] underline = string.split(" ");
				
				for (int i = 0; i < underline.length; i++) {
					if (importantWord.equalsIgnoreCase(underline[i])) 
						underline[i] = "-".repeat(underline[i].length());
					else 
						underline[i] = " ".repeat(underline[i].length());
				}
				System.out.println(string);
				for (String word : underline) {
					System.out.print(word + " ");
				}
			}
		}
	
	//solution in CaptainCiaoCiao differs:
	//I don' know what's better: to build an array and just exchange its members or constantly overwrite a String and build for every iteration
	// a new String Object
	
	static void printUnderline(String string, String search) {
		System.out.println(string);
		
		string = string.toLowerCase();
		search = search.toLowerCase();
		
		String secondLine = "";
		for (int index = 0;
				(index = string.indexOf(search, index)) >=0;
				index += search.length()) {
			
			for (int i = 0, len = index-secondLine.length(); i < len; i++)
				secondLine += " ";
			for (int i = 0; i < search.length(); i++)
				secondLine += "-";
		}
		System.out.println(secondLine);
	}

}
