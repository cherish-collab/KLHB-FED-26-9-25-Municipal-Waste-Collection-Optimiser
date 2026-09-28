import java.util.Scanner;

public class ShelfSplit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter parcels, shelves: ");

        int parcels = sc.nextInt();
        int shelves = sc.nextInt();

        int per = parcels / shelves;
        int leftover = parcels % shelves;

        System.out.println(per + " each, " + leftover + " left over");

        sc.close();
    }
}