package chapter2.src;

public class BruteForce {
    public static void main (String[] args) {
        for (int x = 0; x < 10; x++) {
            for (int o = 0; o < 10; o++) {
                for (int l = 0; l < 10; l++) {
                    for (int t = 0; t < 10; t++) {
                        if (((x + l) == t) && (x != l) && (x != t) && (l != t) ) {
                            System.out.printf("%d + %d = %d %nX = %d%nL = %d%nT = %d%n", x, l, t, x, l, t);
                        } else if (((o + x) == l) && (o != x) && (o != l) && (x != l)){
                            System.out.printf("%d + %d = %d %nO = %d%nX = %d%nL = %d%n", o, x, l, o, x, l);
                        } else if (((l + x) == t) && (l != x) && (l != t) && (x != t)) {
                            System.out.printf("%d + %d = %d %nL = %d%n X = %d%nT = %d%n", l, x, t, l, x, t);
                        }
                    }
                }
            }
        }
    }
}
