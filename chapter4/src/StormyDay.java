package src;

import java.util.Random;

public class StormyDay {
    public static void main(String[] args) {
        Random random = new Random();
        int[] windDirection = new int[3];
        int[] windSpeed = new int[3];

        for (int i = 0; i < windDirection.length; i++) {
            windDirection[i] = random.nextInt(361);
            windSpeed[i] = random.nextInt(201);
            System.out.printf("Wind speed %d km/h, wind direction %d\u00B0. ", windSpeed[i], windDirection[i]);
        }
    }
}
