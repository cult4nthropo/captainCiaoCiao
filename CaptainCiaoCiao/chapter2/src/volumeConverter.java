public class volumeConverter {
    public static void main (String[] args) {
        System.out.println("How many liter of liquid do we have?");

        double givenVolume = new java.util.Scanner(System.in).nextDouble();

        if (givenVolume >= 1) {
            System.out.printf("%d l", (int)givenVolume);
        } else if (givenVolume >= 0.1) {
            System.out.printf("%d cl", (int)(givenVolume*100));
        }else if (givenVolume >= 0.001) {
            System.out.printf("%d ml", (int)(givenVolume*1000));
        }else {
            System.out.println("Value too small to display.");
        }
    }
}
