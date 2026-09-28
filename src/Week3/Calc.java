import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double x = sc.nextDouble();

        System.out.print("Enter operator: ");
        char op = sc.next().charAt(0);

        System.out.print("Enter second number: ");
        double y = sc.nextDouble();

        double r;
        boolean ok = true;

        switch (op) {

            case '+':
                r = x + y;
                break;

            case '-':
                r = x - y;
                break;

            case '*':
                r = x * y;
                break;

            case '/':
                if (y == 0) {
                    ok = false;
                    r = 0;
                }
                else {
                    r = x / y;
                }
                break;

            default:
                ok = false;
                r = 0;
        }

        if (ok) {
            System.out.println("Result = " + r);
        }
        else {
            System.out.println("Error");
        }

        sc.close();
    }
}