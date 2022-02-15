package src;

public class MagnifyArray {
    public static void main (String[] args) {
        int [][] array = new int[][] {
                {2, 3, 4, 1},
                {3, 7, 6, 3}

        };
        /**
         * If i magnify this array with the factor 3 the magnified array should be:
         * 2, 2, 2, 3, 3, 3, 4, 4, 4
         * 2, 2, 2, 3, 3, 3, 4, 4, 4
         * 2, 2, 2, 3, 3, 3, 4, 4, 4
         * 2, 2, 2, 5, 5, 5, 6, 6, 6
         * 2, 2, 2, 5, 5, 5, 6, 6, 6
         * 2, 2, 2, 5, 5, 5, 6, 6, 6
         * 2, 2, 2, 5, 5, 5, 6, 6, 6
         */
        int[][] magnifiedArray = magnify(array, 3);
        for (int i = 0; i < magnifiedArray.length; i++) {
            for (int j = 0; j < magnifiedArray[i].length; j++) {
                System.out.print(magnifiedArray[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] magnify(int[][] array, int factor) {
        //this only works, if every element of the outer array has the same size
        int outerLength = array.length * factor;
        int innerLength = array[0].length * factor;
        int[][] magnifiedArray = new int[outerLength][innerLength];
    //TODO the incremention never gets higher than 1 -> fix this
        for (int i = 0,  outerIndex = 0; (i < array.length) && (outerIndex < outerLength); i++) {
            System.out.println("i = " + i);
            System.out.println(outerIndex);

            //the code never enters the while loop, so the outer index never gets incremented
            while ( outerIndex != 0 || outerIndex % factor != 0) {

                magnifiedArray[outerIndex] = magnifiedArray[outerIndex-1].clone();
                outerIndex++;
            }
                for (int j = 0, innerIndex = 0; j < array.length && innerIndex < innerLength; j++) {
                    System.out.println("j = " + j);
                    int count = 0;
                    while (count < factor) {
                        magnifiedArray[outerIndex][innerIndex] = array[i][j];
                        innerIndex++;
                        count++;
                    }
                }
        }
        return magnifiedArray;
    }
}
