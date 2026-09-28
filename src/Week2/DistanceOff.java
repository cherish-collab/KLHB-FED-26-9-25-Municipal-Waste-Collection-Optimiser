import java.util.Scanner;

public class DistanceOff {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter target, actual: ");

        int target = sc.nextInt();
        int actual = sc.nextInt();

        int diff = actual - target;
        int off;

        if (diff < 0) {
            off = -diff;
        }
        else {
            off = diff;
        }

        System.out.println("Off target by " + off + " kg");

        sc.close();
    }
}