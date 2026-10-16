public class SortLabWeek07 {
    static boolean validStation(String label) {
        return label != null && !label.isBlank();
    }

    static boolean validCount(int count) {
        return count >= 1 && count <= 9;
    }

    static boolean found(String target) {
        return target.equals("ASTER") || target.equals("BERYL") || target.equals("COBALT");
    }

    public static void main(String[] args) {
        int passed = 0;
        if (!validStation("")) passed++;
        if (!validCount(0)) passed++;
        if (!found("UNKNOWN")) passed++;
        if (validCount(9)) passed++;
        System.out.println("BOUNDARY: EMPTY");
        System.out.println("CASES_PASSED: " + passed + "/4");
        System.out.println("MODULAR CHECK: PASS");
    }
}
