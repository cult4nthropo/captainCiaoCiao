import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class exercises {
    public static void main(String[] args) {

        System.out.println("Wie viele Flaschen wurden erbeutet?");
        int capturedBottles = new java.util.Scanner(System.in).nextInt();
        NumberFormat numberFormat = new DecimalFormat("0.0");
        numberFormat.setRoundingMode(RoundingMode.DOWN);
        int captainsPart = capturedBottles/2;
        System.out.printf("Captain Ciao Ciao bekommt %d Flaschen. %n", captainsPart);
        int crewsPart = capturedBottles - captainsPart;
        System.out.printf("Die Crew bekommt %d Flaschen", crewsPart);
        System.out.println();
        System.out.println("Und wie viele Mitglieder hat die Crew?");
        int crewMembers = new java.util.Scanner(System.in).nextInt();
        boolean fairDistribution = (crewsPart%crewMembers == 0);
        System.out.printf("Die Beute kann fair auftgeteilt werden: %b", fairDistribution);


    }
}