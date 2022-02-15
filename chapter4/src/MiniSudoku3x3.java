package src; /**
 * User can enter number in every cell of one block of a sudoku iterating through a two dimensional array
 */

import java.util.Scanner;

public class MiniSudoku3x3 {

    public static void main(String[] args) {
        int [][] fieldToCheck = new int[3][3];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < fieldToCheck.length; i++){
            for (int j = 0; j < fieldToCheck[i].length; j++) {
                int entryNumber = scanner.nextInt();
                if (isNotSuitableValue(entryNumber, fieldToCheck)){
                    System.out.printf("Jede Zahl kommt genau einmal vor. %d ist bereits enthalten." +
                            "oder ist nicht zwischen 1 und 9. %n", entryNumber);
                    j--; // to try this exact field again befor the for-loop adds 1 to j or gets in the next i-iteration
                } else {
                    fieldToCheck[i][j] = entryNumber;
                }
            }
        }
        for (int i = 0; i < fieldToCheck.length; i++) {
            for (int j = 0; j < fieldToCheck[i].length; j++){
                System.out.print(fieldToCheck[i][j]);
            }
            System.out.println();
        }
    }

    /**
     *
     * @param number the number entered by the user
     * @param sudoku the field of the one-block sudoku till now
     * @return returns true if the entered number is  not suitable
     */
    public static boolean isNotSuitableValue(int number, int sudoku[][]) {
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku[i].length; j++) {
                if ((number == sudoku[i][j]) || (number < 1) ||( number > 9)) {
                    return true;
                }
            }
        }
        return false;
    }
}
