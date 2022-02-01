package chapter2.src;

public class numberPyramid {
    public static void main (String[] args) {
        final int MAX = 11;
        for (int i = 1; i < MAX; i++) {
            for (int whiteSpace = (MAX - i); whiteSpace > 0; whiteSpace--) {
                System.out.print("  ");
            }
            int j = i;
            while (j > 0) {
                if (i >= 10){
                    System.out.print(" " + i);
                } else {
                    System.out.print(" " + i + " ");
                }
                j--;
            }
            System.out.println();
        }
    }
}
