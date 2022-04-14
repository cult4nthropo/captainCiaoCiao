package chapter2.src.exercises;

public class Collatz {
    public  long collatz ( long n) {
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
                System.out.println(n);
            } else {
                n = 3 * n + 1;
                System.out.println(n);
            }
        }
        return n;
    }
    public long collatzMax (long n) {
        long max = 0;

        while (n != 1) {
            if (n > max) {
                max = n;
            }
            if (n % 2 == 0) {
                n = n / 2;
                System.out.println(n);
            } else {
                n = 3 * n + 1;
                System.out.println(n);
            }
        }
        System.out.printf("Die größte Zahl der Folge ist: %d", max);
        return max;
    }

    /**
     * This only does work if max is less n
     * With a parameter n less than 7 and a max of 27 it just gives the max value without checking if max is part of collatz
     * @param n
     * @param max
     * @return
     */
    public long collatzMaxRecursive (long n, long max)  {
        if (n > 1) {
            if (n % 2 == 0) {
                return collatzMaxRecursive(n / 2, Math.max(n, max));

            }
            return collatzMaxRecursive( 3 * n + 1, Math.max(n, max));
        }
        return max;
    }
}
