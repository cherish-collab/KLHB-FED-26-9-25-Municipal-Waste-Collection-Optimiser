import java.util.Scanner;

public class RPS9{
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        char p = sc.next().charAt(0), q = sc.next().charAt(0);
        String r;
        if (p == q) r = "draw";
        else if ((p == 'R' && q == 'S') || (p == 'S' && q == 'P') || (p == 'P' && q == 'R'))
            r = "player 1";
        else r = "player 2";
        System.out.println(r);
    }
}