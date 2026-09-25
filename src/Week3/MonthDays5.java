import java.util.Scanner;

public class MonthDays5 {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), y = sc.nextInt();
        int days;
        switch (m) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            case 2:
                days = ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) ? 29 : 28;
                break;
            default:
                days = -1;
        }
        System.out.println(days);
    }
}