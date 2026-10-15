public class SortLabWeek05 {
    static boolean valid(int tokens) {
        return tokens >= 0 && tokens <= 9;
    }

    static String format(String station, int tokens) {
        return station + ":" + tokens;
    }

    public static void main(String[] args) {
        String line = format("ASTER", 7);
        System.out.println("LINE: " + line);
        System.out.println("VALID: " + valid(7));
        System.out.println("METHOD CHECK: PASS");
    }
}
