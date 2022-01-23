public class Faculty {
    public static void main (String [] args) {
        System.out.println("How many people does the crew have?");
        long numberOfPeople = new java.util.Scanner(System.in).nextLong();
        if (numberOfPeople < 0) {
            System.out.println("The number can not be negative");
        }
        int i;
        long possibilities = 1;

        for (i = 1; i <= numberOfPeople; i++) {
            possibilities *= i;
        }
        System.out.printf("There are %d possibilities to build a crew",possibilities);
    }
}
