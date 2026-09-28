import java.util.Scanner;

public class SeasonFromMonth {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int m = sc.nextInt();

        String season;

        if (m == 12 || m <= 2) {
            season = "winter";
        }
        else if (m <= 5) {
            season = "spring";
        }
        else if (m <= 8) {
            season = "summer";
        }
        else {
            season = "autumn";
        }

        System.out.println("Month " + m + " -> " + season);

        sc.close();
    }
}