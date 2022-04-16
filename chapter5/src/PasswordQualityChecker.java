package src;

//just to make this clear: this is just an exercise. In reality I would not check for any password in plain text ;)
public class PasswordQualityChecker {

	public static void main(String[] args) {

		isGoodPassword("GroeLaZ1.safadsterfvyvyxfvcvxcgycyxxdfxczulkluiiljh,klvyxcfvxcv");

	}
	/*
	 * Regex for password complexity:
	 * ^ start of string
	 * (?=.*[0-9]) at least one digit
	 * (?=.*[a-z]) at least one lower case letter
	 * (?=.*[A-Z]) at least one upper case letter
	 * (?=.*[@#$%&^+=-_.:]) at least one of the mentioned special character
	 * (?=\s+$) no whitespaces allowed
	 * .{8,32} length between 8 and 32 characters
	 * $ end of string
	 */
	public static boolean isGoodPassword(String password) {
		String complexity = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!\"§$%&/()=?@+*#.:,;])(?=\\S+$).{8,32}";
		if (password.matches(complexity)) {
			System.out.println("good");
			return true;
		}
			
		System.out.print(password + " Didn't match the criteria.\n"
				+ "You nead at least:\n"
				+ "1 digit, 1 lower and 1 upper case letter\n"
				+ "1 special sign\n"
				+ "no whitespace and a length between 8 and 32 characters");
		return false;
	}
}
