public class FactorialReverse {
    public static void main (String [] args) {
        System.out.println("Just give me a number and I tell you if it is a factorial.");

        long numberToCheck = new java.util.Scanner(System.in).nextLong();
        long number = numberToCheck;
        int i;

        for (i = 1; (number % i) == 0; i++){
            number /= i;
        }
        if ( number == 1 ) {
            System.out.printf("%d = %d!", numberToCheck, i-1);
        } else {
            System.out.printf("%d is not a factorial", numberToCheck);
        }
    }
}
