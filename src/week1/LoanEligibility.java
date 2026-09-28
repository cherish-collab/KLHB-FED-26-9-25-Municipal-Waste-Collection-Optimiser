import java.util.Scanner;

public class LoanEligibility {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age, income, credit score: ");

        int age = sc.nextInt();
        int income = sc.nextInt();
        int score = sc.nextInt();

        boolean eligible;

        if (age >= 21 && age <= 60 && income >= 25000 && score >= 700) {
            eligible = true;
        }
        else {
            eligible = false;
        }

        if (eligible) {
            System.out.println("APPROVED");
        }
        else {
            System.out.println("REJECTED");
        }

        sc.close();
    }
}