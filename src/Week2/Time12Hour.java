import java.util.Scanner;

public class Time12Hour {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hour (0-23): ");
        int h = sc.nextInt();

        int h12;

        if (h % 12 == 0) {
            h12 = 12;
        }
        else {
            h12 = h % 12;
        }

        String ampm;

        if (h < 12) {
            ampm = "AM";
        }
        else {
            ampm = "PM";
        }

        System.out.println(h + ":00 = " + h12 + " " + ampm);

        sc.close();
    }
}