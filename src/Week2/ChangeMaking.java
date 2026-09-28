import java.util.Scanner;

public class ChangeMaking {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount in rupees: ");
        int amt = sc.nextInt();

        int n500 = amt / 500;
        amt = amt % 500;

        int n100 = amt / 100;
        amt = amt % 100;

        int n50 = amt / 50;
        amt = amt % 50;

        int n10 = amt / 10;
        amt = amt % 10;

        int n1 = amt;

        System.out.println("500x" + n500 + " 100x" + n100 + " 50x" + n50 + " 10x" + n10 + " 1x" + n1);

        sc.close();
    }
}