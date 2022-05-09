package src;

import java.util.Random;

public class StormyDay {
    public static void main(String[] args) {
        Random random = new Random();
        final int ARRAY_LENGTH = 5;
        int[] windDirection = new int[ARRAY_LENGTH];
        int[] windSpeed = new int[ARRAY_LENGTH];

        for (int i = 0; i < ARRAY_LENGTH; i++) {
            windDirection[i] = random.nextInt(361);
            windSpeed[i] = random.nextInt(201);
            System.out.printf("Wind speed %d km/h and wind direction %d\u00B0 ", windSpeed[i], windDirection[i]);
            if(i != ARRAY_LENGTH-1) {
                System.out.print(", ");
            }
        }
    }
}
