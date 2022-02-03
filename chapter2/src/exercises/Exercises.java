package captainCiaoCiao.CaptainCiaoCiao.chapter2.src.exercises;


public class Exercises {
    public static void main(String[] args) {
/*
        Lines lines = new Lines();
        lines.line(10);
        System.out.println();
        lines.line(5, 'x');
        System.out.println();
        lines.line("||", 10, '=', "||");

        RightTriangle triangle = new RightTriangle();
        System.out.println(triangle.isRightTriangle(1, 2, 3));
        System.out.println();
        Collatz collatz = new Collatz();
        //collatz.collatz(27);
        collatz.collatzMax(7);
        System.out.println();
        System.out.println(collatz.collatzMaxRecursive(7, 27));


*/
        HTMLtable htmLtable = new HTMLtable();
        htmLtable.startHTML();
        htmLtable.startTable();
        htmLtable.tableHead();
        htmLtable.tableRow(500, 100);
        htmLtable.endTable();
        htmLtable.endHTML();
    }
}