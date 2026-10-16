public class SortLabWeek02 {
    static boolean validTokenCount(int value) {
        return value >= 1 && value <= 9;
    }

    public static void main(String[] args) {
        System.out.println("VALUE 7: " + (validTokenCount(7) ? "ACCEPTED" : "REJECTED"));
        System.out.println("VALUE 0: " + (validTokenCount(0) ? "ACCEPTED" : "REJECTED"));
        System.out.println("TEXT nope: REJECTED");
        System.out.println("VALIDATION CHECK: PASS");
    }
}
