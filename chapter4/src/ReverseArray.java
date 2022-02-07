package src;

public class ReverseArray {
    public static void main (String[] args) {
        double[] numbers = {1,2,3,4,5};
        reverse(numbers);

    }

    public static void reverse(double[] numbers) {
        double temp;
        int front = 0;
        int back = numbers.length-1;

        while (front != back) {
            temp = numbers[front];
            numbers[front] = numbers[back];
            numbers[back] = temp;
            front++;
            back--;
        }
        for(int i = 0; i < numbers.length; i++) {
            System.out.printf("%d, ", (int)numbers[i]);
        }
    }
}
