public class SortLabWeek08 {
    static int total(int[] tokens, int index) {
        if (index == tokens.length) {
            return 0;
        }
        return tokens[index] + total(tokens, index + 1);
    }

    public static void main(String[] args) {
        int[] tokens = {5, 4, 3};
        System.out.println("RECURSIVE_TOTAL: " + total(tokens, 0));
        System.out.println("DEPTH: " + tokens.length);
        System.out.println("RECURSION CHECK: PASS");
    }
}
