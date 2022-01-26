package CaptainCiaoCiao.chapter2.src;

public class JustAy {
    public static void main (String[]args) {
        System.out.println("Anything to tell?");
        String justYes = new java.util.Scanner(System.in).nextLine();

        if (justYes.equals("Ay") || justYes.equals("Ay, ay") || justYes.equals("Ein Ei") || justYes.equals("Yes")) {
            System.out.println("Keep it up!");
        } else {
            System.out.println("Don't you dare!");
        }
    }
}
