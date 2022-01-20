import java.util.Locale;

public class SvgCircle1 {
    public static void main(String[] args) {

        int x = 10;
        int y = 10;
        double r = (Math.random() * 10) + 10;

        System.out.printf(Locale.ENGLISH,"<svg height=\"400\" width=\"400\">%n <circle cx=\"%d\" cy=\"%d\" r=\"%#.2f\"%n</svg>\n", x, y, r);

    }
}