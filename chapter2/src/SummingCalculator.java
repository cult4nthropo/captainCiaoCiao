package captainCiaoCiao.CaptainCiaoCiao.chapter2.src;

import java.util.Scanner;

public class SummingCalculator {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        int prize;
        int loot = 0;
        do {
            prize = scanner.nextInt();
            loot += prize;
        }while (prize != 0);
        System.out.printf("Sum: %d", loot);
    }
}