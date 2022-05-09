package src;

import java.awt.*;

public class NearestPointToZero {
    public static void main (String[] args) {
        Point[] points = {new Point(10, 20), new Point(12, 2), new Point(44, 4)};
        minDistance(points, points.length);

    }

    public static Point minDistance(Point[] points, int size) {
        if (size > points.length || points.length == 0) {
            throw new IllegalArgumentException("Die Liste ist leer oder kürzer als 'size'");
        }
        double minDistance = 0;
        Point nearest = new Point();
        for (int i = 0; i < size; i++) {

            double distance = points[i].distance(0,0);
            System.out.println(distance);
            if (distance < minDistance || minDistance == 0) {
                minDistance = distance;
                nearest = points[i];
            }
        }
        return nearest;
    }
}
