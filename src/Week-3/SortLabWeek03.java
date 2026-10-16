public class SortLabWeek03 {
    static String badgeFor(int score) {
        return score >= 15 ? "EMBER" : "SPARK";
    }

    public static void main(String[] args) {
        int score = 12 + 3;
        System.out.println("SCORE: " + score);
        System.out.println("BADGE: " + badgeFor(score));
        System.out.println("DECISION CHECK: PASS");
    }
}
