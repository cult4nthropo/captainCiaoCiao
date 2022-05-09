package src;

public class MagnifyArray {
    public static void main (String[] args) {
        int [][] array = new int[][] {
                {2, 3, 4, 1},
                {2, 5, 6, 7}

        };

        printArray(array);
        int[][] magnifiedArray = magnify(array, 4);
        printArray(magnifiedArray);
    }

    public static int[][] magnify(int[][] array, int factor) {
        //this only works, if every inner array has the same size
        int newRowLength = array.length * factor;
        int newColumnLength = array[0].length * factor;
        int[][] magnifiedArray = new int[newRowLength][newColumnLength];

        for (int newRowIndex = 0; newRowIndex < newRowLength; newRowIndex++){

            for (int newColumnIndex = 0; newColumnIndex < newColumnLength; newColumnIndex++){

                    magnifiedArray[newRowIndex][newColumnIndex] = array[newRowIndex/factor][newColumnIndex/factor];

            }
        }


        return magnifiedArray;
    }

    public static void printArray (int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
