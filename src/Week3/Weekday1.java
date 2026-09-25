import java.util.Scanner;

public class Weekday1 {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        String name;
        switch (d) {
            case 1:
                name = "Monday";
                break;
            case 2:
                name = "Tuesday";
                break;
            case 3:
                name = "Wednesday";
                break;
            case 4:
                name = "Thursday";
                break;
            case 5:
                name = "Friday";
                break;
            case 6:
                name = "Saturday";
                break;
            case 7:
                name = "Sunday";
                break;
            default:
                name = "invalid";
        }
        System.out.println(name);
    }
}