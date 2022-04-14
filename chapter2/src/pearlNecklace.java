package chapter2.src;

import java.util.Random;

public class pearlNecklace {
    public static void main (String[] args) {
        double amountPearls = 50;
        String[] color = {"red", "green", "orange"};
        Random random = new Random();

        int x = 10;
        System.out.println("<svg height=\"100\" width=\"1000\">%n" );

        for (int i = 0; i < amountPearls; i++) {
            int randomColor = random.nextInt(color.length);
            System.out.printf("   circle cx=\"%d\" cy=\"20\" r=\"5\" fill=\"%s\"%n", x, color[randomColor]);
            x += 10;
        }
        System.out.println("</svg>");
    }
}
