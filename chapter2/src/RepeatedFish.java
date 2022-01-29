package chapter2.src;

import java.util.Scanner;

public class RepeatedFish {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wie oft soll das Motiv wiederholt werden?");
        int repetition= scanner.nextInt();
        final String leftFish = "<>< ";
        final String rightFish = "><> ";

        for (int i = 0; i < repetition; i++) {
            String repeatedLeftie = leftFish.repeat(repetition);
            System.out.print(repeatedLeftie);
            String repeatedRightie = rightFish.repeat(repetition);
            System.out.println(repeatedRightie);
        }
    }
}
