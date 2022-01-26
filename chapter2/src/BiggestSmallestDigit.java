package captainCiaoCiao.CaptainCiaoCiao.chapter2.src;

public class BiggestSmallestDigit {
    public static void main (String [] args) {
        System.out.println("Please enter a number");
        long number = new java.util.Scanner(System.in).nextLong();
        long max = 0;
        long min = number == 0 ? 0 : 9;

        for (long value = Math.abs(number); number !=0; number /= 10) {
            long lastDigit = number % 10;
            max = Math.max(lastDigit, max);
            min = Math.min(lastDigit, min);
        }
        System.out.printf("The smallest digit is %d %n The biggest digit is %d", min, max);
    }
}
