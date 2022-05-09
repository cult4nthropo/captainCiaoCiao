package src;

public class YZswapper {

	public static void main(String[] args) {

		printSwapped("yootaxz");

	}
	
	public static void printSwapped(String message) {
		System.out.println("Original message: " + message);
		System.out.print("Corrected with if-else: ");
		
		for(int i = 0; i < message.length(); i++) {
			char c = message.charAt(i);
			if (c == 'y') {
				System.out.print('z');
			} else if (c == 'z' ) {
				System.out.print('y');
			} else {
				System.out.print(c);
			}
		}
		
		System.out.println();
		
		
		System.out.print("Corrected with switch case: ");
		for(int i = 0; i < message.length(); i++) {
			char c = message.charAt(i);
			switch(c) {
			case 'y':
				System.out.print('z');
				break;
			case 'z':
				System.out.print('y');
				break;
			default:
				System.out.print(c);
				break;
			}
		}
	}
}
