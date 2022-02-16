package src;

import java.awt.*;

public class SvgPolygonWithVarargs {
    public static void main(String[] args) {
        Point point = new Point(1, 500);
        Point point1 = new Point(50, 300);
        Point point2 = new Point(3, 350);
        Point point3 = new Point(120, 15);
        Point point4 = new Point(600, 1);
        printSvgPolygon(point,point1, point2, point3, point4);


    }

    /**
     *
     * @param point1 the vararg argument consits of one point minimum
     * @param args the amount of points could vary
     */
    public static void printSvgPolygon (Point point1, Point...args){
        System.out.printf("<polygon points = \"%.0f, %.0f", point1.getX(), point1.getY());
        for (Point x:args) {
            System.out.printf(", %.0f, %.0f", x.getX(), x.getY());
        }
        System.out.print("\"/>");
    }
}
