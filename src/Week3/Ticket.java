import java.util.Scanner;

public class Ticket {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter day: ");
        String day = sc.next();

        int base;

        if (age < 12) {
            base = 5;
        }
        else if (age >= 65) {
            base = 7;
        }
        else {
            base = 10;
        }

        boolean weekend;

        if (day.equals("Sat") || day.equals("Sun")) {
            weekend = true;
        }
        else {
            weekend = false;
        }

        int price;

        if (weekend) {
            price = base + 2;
        }
        else {
            price = base;
        }

        System.out.println("Rs " + price);

        sc.close();
    }
}