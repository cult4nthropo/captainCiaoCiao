package chapter2.src;

import java.util.Random;

public class Chrismastree {
    public static void main (String[] args) {
        int width = 10;
        String leaves = "*";
        String bullet = "o";
        Random random = new Random();


        for (int stars = 1, intentation = (width - 1); stars <= width; stars += 2, intentation--) {
            int randomBullet = random.nextInt(1, width-1);
            for (int i = 0; i < intentation; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < stars; i ++) {
                System.out.print( randomBullet == i ? "o" :"*");
            }
            System.out.println();
        }
    }
}
