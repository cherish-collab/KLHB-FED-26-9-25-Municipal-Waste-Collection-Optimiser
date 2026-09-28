import java.util.Scanner;

public class OppositeSigns {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers: ");

        int x = sc.nextInt();
        int y = sc.nextInt();

        boolean opposite = (x ^ y) < 0;

        if (opposite) {
            System.out.println("opposite signs");
        }
        else {
            System.out.println("same sign");
        }

        sc.close();
    }
}