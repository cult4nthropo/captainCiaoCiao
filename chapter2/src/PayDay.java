package captainCiaoCiao.CaptainCiaoCiao.chapter2.src;

public class PayDay {
    public static void main (String[]args){
        int payed = new java.util.Scanner(System.in).nextInt();
        int debt = 1_000;
        double lowerLimit = 0.1 * debt;
        double upperLimit = 1.2 * debt;

        System.out.printf("%s", (payed < lowerLimit || payed > upperLimit) ? "You son of a bi***!" : "Good boy");
    }
}
