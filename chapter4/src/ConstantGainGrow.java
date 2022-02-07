package src;

import java.util.Random;

public class ConstantGainGrow {
    public static void main(String[] args) {
        Random random = new Random();
        int [] dailyGains = new int[32];
        int[] possibleGains = {1000, 2000, 500, 9000, 9050};
        for(int i = 0; i< dailyGains.length; i++) {
            dailyGains[i] = possibleGains[random.nextInt(possibleGains.length)];
        }
        //countPercentCount(dailyGains);
        int count = count5percentJumps(dailyGains);
        System.out.printf("%d Umsatzsprünge in diesem Monat", count);
    }


    public static int count5percentJumps(int[] dailyGains) {

        int count = 0;
        for(int i = 0; i < dailyGains.length; i++) {
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
