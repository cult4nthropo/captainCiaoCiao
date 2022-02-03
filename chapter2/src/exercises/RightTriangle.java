package captainCiaoCiao.CaptainCiaoCiao.chapter2.src.exercises;

public class RightTriangle {
    RightTriangle() {

    }
    public static boolean isRightTriangle( double x, double y, double z) {

        if (x > y && x > z) {
           double swap = z;
           z = x;
           x = swap;
            } else if (y > z && y > x) {
            double swap = z;
            z = y;
            y = swap;
        }
        return (x * x) + (y * y) == (z * z);
    }
}
