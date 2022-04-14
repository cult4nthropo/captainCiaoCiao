package chapter2.src;

public class MathIterator {
    public static void main (String [] args) {
        double t = Math.random() * 10;
        System.out.println(t);

        while (t > 0) {
            t = ((t < 1) ? t * 2 : t--);
            System.out.println(t);
        }
    }
}
