import java.util.Locale;

public class SvgCircle1 {
    public static void main(String[] args) {

        int x = new java.util.Scanner(System.in).nextInt();
        int y = new java.util.Scanner(System.in).nextInt();
        double r = new java.util.Scanner(System.in).nextDouble();

        System.out.printf(Locale.ENGLISH,"<svg height=\"400\" width=\"400\">%n <circle cx=\"%d\" cy=\"%d\" r=\"%#.2f\"%n</svg>\n", x, y, r);

    }
}