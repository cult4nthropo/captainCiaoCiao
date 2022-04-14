package chapter2.src;

import java.util.Locale;
import java.util.Scanner;

public class CoinMachine {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);

        System.out.println("How much money do we have Captain?");
        double [] coinValue = {2.0, 1.0, 0.5, 0.2, 0.1, 0.05, 0.02, 0.01};
        double moneyAmount = scanner.nextDouble();
        String EURO = "\u20ac";

        for (int i = 0; i < coinValue.length; i++) {
            int coinCount = (int) (moneyAmount / coinValue[i]);
            System.out.printf(Locale.GERMAN,"%d x %s %s %n", coinCount, coinValue[i], EURO);
            moneyAmount -= coinCount * coinValue[i];
        }
        scanner.close();


    }
}
