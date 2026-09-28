import java.util.Scanner;

public class LockerTier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Parcel weight (kg): ");
        double weight = scanner.nextDouble();

        char tier;
        if (weight <= 5.0) {
            tier = 'S';
        } else if (weight <= 10.0) {
            tier = 'M';
        } else {
            tier = 'L';
        }

        System.out.println(weight + " kg -> tier " + tier);
    }
}