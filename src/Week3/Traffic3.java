import java.util.Scanner;

public class Traffic3{
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        String act;
        switch (c) {
            case 'R':
            case 'r':
                act = "STOP";
                break;
            case 'Y':
            case 'y':
                act = "SLOW";
                break;
            case 'G':
            case 'g':
                act = "GO";
                break;
            default:
                act = "invalid";
        }
        System.out.println(act);
    }
}