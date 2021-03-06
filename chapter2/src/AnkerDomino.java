package chapter2.src;

import java.util.Scanner;

public class AnkerDomino {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	
        System.out.println("Welche Zahl hat der erste Stein?");
        int firstStone =scanner.nextInt() % 100;
        System.out.println("Welche Zahl hat der zweite Stein?");
        int secondStone = scanner.nextInt() % 100;

        int firstStoneFirstDigit = firstStone / 10;
        int firstStoneSecondDigit = firstStone % 10;
        int secondStoneFirstDigit = secondStone / 10;
        int secondStoneSecondDigit = secondStone % 10;

        boolean hasCommonDigits = firstStoneFirstDigit == secondStoneFirstDigit
                || firstStoneFirstDigit == secondStoneSecondDigit
                || firstStoneSecondDigit == secondStoneFirstDigit
                || firstStoneSecondDigit == secondStoneSecondDigit;
        System.out.println(hasCommonDigits);
        
        scanner.close();

    }
}