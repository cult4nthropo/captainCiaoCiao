package captainCiaoCiao.CaptainCiaoCiao.chapter2.src.exercises;


public class Exercises {
    public static void main(String[] args) {

        Lines lines = new Lines();
        lines.line(10);
        lines.line(5, 'x');
        lines.line("||", 10, '=', "||");

        RightTriangle triangle = new RightTriangle();
        System.out.println(triangle.isRightTriangle(5, 3, 4));


    }
}