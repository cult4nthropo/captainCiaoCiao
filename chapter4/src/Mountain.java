package src;

public class Mountain {
    public static void main (String[] args) {
        int[] altitudes = {0, 1, 1, 2, 2, 3, 3, 3, 4, 5, 4, 3, 2 ,2 ,1, 0};
        printMountain(altitudes);

    }
    public static void printMountain(int[] altitudes) {
        int currentHeight = 0;
        for (int elem : altitudes) {
            currentHeight = Math.max (currentHeight, elem);
        }

        while (currentHeight >= 0) {
            for (int i = 0; i < altitudes.length; i++) {
                if (altitudes[i] != currentHeight) {
                    System.out.print(" ");
                } else {
                    System.out.print(mountainChar(altitudes, i));
                }
            }
            System.out.println();
            currentHeight--;
        }
    }

    public static String mountainChar(int [] altitudes, int index) {
        int maxAltitude = 0;
        for (int elem : altitudes) {
            maxAltitude = Math.max(elem, maxAltitude);
        }
        String mountainChar = " ";
        if (index == 0) {
            mountainChar = "/";
        } else if (index == altitudes.length) {
            mountainChar = "\\";
        } else if (altitudes[index] == maxAltitude){
            mountainChar = "^";
        } else if (altitudes[index] < altitudes[index-1]) {
            mountainChar = "\\";
        } else if (altitudes[index] < altitudes[index+1]){
            mountainChar = "/";
        } else {
            mountainChar = "_";
        }


        return mountainChar;
    }
}
