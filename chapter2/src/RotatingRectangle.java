package captainCiaoCiao.CaptainCiaoCiao.chapter2.src;

public class RotatingRectangle {
    public static void main (String [] args) {
        int rotate = 0;

        for (int i = 0; i < 10; i++) {
            System.out.printf("<svg height = \"200\" width=\"200\"> %n" +
                    "   <rect x=\"50\" y=\"50\" width=\"100\" height=\"100\" stroke=\"black\" fill=\"none\"%n" +
                    "      transform=\"rotate(%d 100 100)\" />%n" +
                    "</svg>", rotate);
            rotate += 10;
        }
    }
}
