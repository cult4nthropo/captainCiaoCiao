package chapter2.src;

public class Twentyone {


    public static void main (String[] args) {
        int player = new java.util.Scanner(System.in).nextInt();
        int dealer = new java.util.Scanner(System.in).nextInt();
        final int MAX = 21;

        if (dealer > MAX || player > MAX) {
            System.out.println(0);
        } else if ((MAX - dealer) > (MAX - player)) {
            System.out.println(player);
        } else if ((MAX - dealer) < (MAX - player)) {
            System.out.println(dealer);
        } else {
            System.out.printf("%d", dealer == MAX ? dealer : player);
        }
    }
}
