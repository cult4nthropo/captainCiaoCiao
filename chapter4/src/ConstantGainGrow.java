package src;

import java.util.Random;

public class ConstantGainGrow {
    public static void main(String[] args) {
        int [] dailyGains = new int[32];
        //countPercentCount(dailyGains);
        int count = countPercentCount(dailyGains);
        System.out.printf("%d Umsatzsprünge in diesem Monat", count);
    }


    public static int countPercentCount(int[] dailyGains) {
        Random random = new Random();
        int count = 0;
        int[] possibleGains = {1000, 2000, 500, 9000, 9050};
        for(int i = 0; i <= 31; i++) {
            dailyGains[i] = possibleGains[random.nextInt(possibleGains.length)];
            System.out.println(dailyGains[i]);

            if (i > 0) {
                int growth = ((dailyGains[i] / dailyGains[i-1]) - 1) * 100;
                if (growth > 5) {
                    System.out.printf("Steigerung: %d%n", growth);
                    System.out.printf("Tag %d: Umsatzsprung von %d", i, growth);
                    System.out.println("%");
                    count++;
                }
            }
        }
        return count;
    }
}
