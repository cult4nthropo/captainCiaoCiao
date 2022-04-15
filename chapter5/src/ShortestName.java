package src;

import java.util.ArrayList;

public class ShortestName {

	public static void main(String[] args) {

		System.out.println(findShortestName("Albert Tross", "Blowfish", "Nick Olaus", "Jo Ker I"));

	}
	
	public static String findShortestName(String...names) {
		if (names == null || names.length < 1) {
			return "no names in list";
		}
		String shortestName = names[0];
		ArrayList<String> nameList = new ArrayList<String>();
		for (String name : names) {
			if (name.contains(" ")) {
				String[] nameParts = name.split("[\\r?\\n+\\s]");
				for(String part:nameParts) {
					nameList.add(part.trim());
				}
			} else {
				nameList.add(name);
			}
		}
		for (int i = 0; i < nameList.size(); i++) {
			if(nameList.get(i).length() < shortestName.length()) {
				shortestName = nameList.get(i);
			}
		}
		return shortestName;
	}

}
