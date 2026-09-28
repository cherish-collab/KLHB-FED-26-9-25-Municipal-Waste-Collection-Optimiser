import java.util.Scanner;

public class TriangleType {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three sides: ");

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        String type;

        if (x == y && y == z) {
            type = "equilateral";
        }
        else if (x == y || y == z || x == z) {
            type = "isosceles";
        }
        else {
            type = "scalene";
        }

        System.out.println(type);

        sc.close();
    }
}