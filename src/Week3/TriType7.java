import java.util.Scanner;

public class TriType7 {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt();
        String t;
        if (x + y <= z || x + z <= y || y + z <= x) t = "not a triangle";
        else if (x == y && y == z) t = "equilateral";
        else if (x == y || y == z || x == z) t = "isosceles";
        else t = "scalene";
        System.out.println(t);
    }
}