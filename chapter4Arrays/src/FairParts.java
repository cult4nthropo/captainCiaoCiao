package src;

import java.util.logging.Logger;

public class FairParts {
    public static void main(String[] args) {
        int[] sweets = {10, 20, 30, 40, 40, 50};
        System.out.println(fairParting(sweets));
    }

    public static int fairParting(int[] sweets){
        if (sweets.length < 2) {
            return -1;
        }

        int sweetsLeft = sweets[0];
        int sweetsRight = 0;
        for (int i = 1; i < sweets.length; i++) {
            sweetsRight += sweets[i];
        }

        for (int splitPoint = 1; splitPoint < sweets.length; splitPoint++) {
            int relativeDifference = relativeDifference(sweetsLeft, sweetsRight);
            Logger.getLogger("MuggingFairly")
                    .info("splitPoint=" + splitPoint
                    + ", sum left/right=" + sweetsLeft + "/" + sweetsRight
                    + ", difference=" + relativeDifference);
            if (relativeDifference <= 10) {

                return splitPoint;
            }
            sweetsLeft += sweets[splitPoint];
            sweetsRight -= sweets[splitPoint];
        }
        return -1;
    }

    public static int relativeDifference ( int a, int b) {
        int absoluteDifference = Math.abs(a - b);
        return (int)(100. * absoluteDifference / Math.max(a, b));
    }
}
