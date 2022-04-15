package src;

public class CrewsizeComparison {

	public static void main(String[] args) {

		compareCrewSize("|||-|||");
		compareCrewSize("|||||-|||");
		compareCrewSize("|||-|||||");
		compareCrewSize("||||||-||");
		compareCrewSize("||||||||");

	}
	
	public static void compareCrewSize(String string) {
		String[] bothCrews = string.split("-");
		
		if(!string.contains("-")) {
			throw new IllegalArgumentException(string + ": Seperator '-' is missing.");
		}
		if(bothCrews[0].length() < bothCrews[1].length()) {
			System.out.printf("Pirate ship had a larger crew, difference %d.\n", bothCrews[1].length() - bothCrews[0].length());
		} else if (bothCrews[0].length() > bothCrews[1].length()) {
			System.out.printf("Raided ship had a larger crew, difference %d.\n", bothCrews[0].length() - bothCrews[1].length());
		} else {
			System.out.println("Ships had the same crew size.");
		}
	}

}
