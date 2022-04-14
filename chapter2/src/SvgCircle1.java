package chapter2.src;

import java.util.Locale;
import java.util.Random;

public class SvgCircle1 {
    public static void main(String[] args) {

        int x = new java.util.Scanner(System.in).nextInt();
        int y = new java.util.Scanner(System.in).nextInt();
        double r = new java.util.Scanner(System.in).nextDouble();
        String[] color = {"green", "red", "blue"};
        Random randomColor = new Random();
        String fill = color[randomColor.nextInt(color.length)];

        System.out.printf(Locale.ENGLISH,"<svg height=\"400\" width=\"400\">%n " +
                "<circle cx=\"%d\" cy=\"%d\" r=\"%#.2f\", fill=\"%s\"%n</svg>\n", x, y, r, fill);

    }
}