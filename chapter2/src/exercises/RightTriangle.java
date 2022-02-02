package captainCiaoCiao.CaptainCiaoCiao.chapter2.src.exercises;

public class RightTriangle {
    RightTriangle() {

    }
    public static boolean isRightTriangle( double x, double y, double z) {
        boolean rightTriangle = false;
        if ((x * x + (y * y)) == (z * z)) {
            rightTriangle = true;
        } else if ((z * z + (x * x)) == (y * y)) {
            rightTriangle = true;
        } else if ((z * z + (y * y)) == (x * x)) {
            rightTriangle = true;
        }
        return rightTriangle;
    }
}
