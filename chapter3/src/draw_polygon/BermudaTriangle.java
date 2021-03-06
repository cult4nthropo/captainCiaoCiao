package src.draw_polygon;
import java.awt.Polygon;
import java.awt.Point;
import java.util.Random;

public class BermudaTriangle {
    public static void main (String[] args) {
        Polygon bermudaTriangle = new Polygon();
        bermudaTriangle.addPoint(0, 49);
        bermudaTriangle.addPoint(50, 30);
        bermudaTriangle.addPoint(25, 15);
        bermudaTriangle = resetWithRandomTriangle(bermudaTriangle);

        for(int i = 0; i < 50; i++) {
            for (int j = 0; j < 50; j ++) {
                Point ship = new Point();
                ship.setLocation(i, j);
                System.out.print(isInBermuda(bermudaTriangle, ship) ? "\uD83D\uDC19" : "\uD83C\uDF08");
            } System.out.println();
        }
    }

    public static boolean isInBermuda(Polygon bermudaTriangle, Point ship) {
        return bermudaTriangle.contains(ship);
    }

    public static Polygon resetWithRandomTriangle(Polygon polygon) {
        polygon.reset();
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            polygon.addPoint(random.nextInt(51), random.nextInt(51));
        }
        return polygon;
    }
}
