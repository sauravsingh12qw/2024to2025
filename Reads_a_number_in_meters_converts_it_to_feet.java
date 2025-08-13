import java.util.Scanner;

public class MetersToFeet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1 meter = 3.28084 feet
        final double METER_TO_FEET = 3.28084;

        System.out.print("Enter length in meters: ");
        double meters = sc.nextDouble();

        double feet = meters * METER_TO_FEET;

        System.out.println(meters + " meters is equal to " + feet + " feet.");

        sc.close();
    }
}
