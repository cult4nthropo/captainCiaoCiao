package captainCiaoCiao.CaptainCiaoCiao.chapter2.src;

public class SingularOrPlural {
    public static void main(String[]args) {
        System.out.println("How many bottles of rum do we have Captain?");
        int noOfBottles = new java.util.Scanner(System.in).nextInt();
        boolean plural = (noOfBottles != 1);
        System.out.printf("%d bottle%s of rum", noOfBottles, plural ? "s" : "");
    }
}
