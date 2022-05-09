package src;

import java.util.Objects;

public class IsProbablyApproaching {
    public static void main (String[] args) {

        String[] signs1 = {"F", "Do", "MOS", "MOS", "MOS", "MOS", "WES"};
        String[] signs2 = {"F", "Do", "MOS", "MOS", "WES", "MOS", "MOS"};

        System.out.println(isProbablyApproaching(signs1));
        System.out.println(isProbablyApproaching(signs2));

    }
    public static boolean isProbablyApproaching(String[] signs) {
        final int MIN_OCCURRENCES = 4;

        if (signs.length < MIN_OCCURRENCES) {
            return false;
        }
        //set count to 1 because a single word equals itself
        int  count = 1;
        //set upper iteration limit to length-1 to avoid an outOfBounds Exception while comparing with sign[i + 1]
        for(int i=0; i < signs.length - 1; i++) {
            String currentSign = Objects.requireNonNull(signs[i]);
            String nextSign = Objects.requireNonNull(signs[i+1]);
            if (currentSign.equals(nextSign)) {
                count++;
                if (count == MIN_OCCURRENCES) {
                    return true;
                }
            } else {
                count = 1;
            }
        }
        return false;
    }
}
