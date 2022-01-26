package captainCiaoCiao.CaptainCiaoCiao.chapter2.src;

import java.awt.*;
import java.util.Locale;

public class CoinMachine {
    public static void main(String[] args) {


        System.out.println("How much money do we have Captain?");
        double [] coinValue = {2.0, 1.0, 0.5, 0.2, 0.1, 0.05, 0.02, 0.01};
        double moneyAmount = new java.util.Scanner(System.in).nextDouble();
        String EURO = "\u20ac";

        for (int i = 0; i < coinValue.length; i++) {
            int coinCount = (int) (moneyAmount / coinValue[i]);
            System.out.printf(Locale.GERMAN,"%d x %s %s %n", coinCount, coinValue[i], EURO);
            moneyAmount -= coinCount * coinValue[i];
        }


    }
}
