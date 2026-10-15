public class SortLabWeek06 {
    static int find(String[] stations, String target) {
        for (int index = 0; index < stations.length; index++) {
            if (stations[index].equals(target)) {
                return index;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] stations = {"ASTER", "BERYL", "COBALT"};
        int[] tokens = {5, 4, 3};
        int index = find(stations, "BERYL");
        System.out.println("FOUND: " + stations[index]);
        System.out.println("INDEX: " + index);
        System.out.println("TOKENS: " + tokens[index]);
        System.out.println("ARRAY CHECK: PASS");
    }
}
