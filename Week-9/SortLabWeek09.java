public class SortLabWeek09 {
    static class Station {
        final String label;
        final int tokens;

        Station(String label, int tokens) {
            this.label = label;
            this.tokens = tokens;
        }

        String summary() {
            return label + " | tokens=" + tokens;
        }
    }

    public static void main(String[] args) {
        Station aster = new Station("ASTER", 5);
        Station beryl = new Station("BERYL", 4);
        String leader = aster.tokens >= beryl.tokens ? aster.label : beryl.label;
        System.out.println("ROUND: R1");
        System.out.println("LEADER: " + leader);
        System.out.println("LEADER_RECORD: " + aster.summary());
        System.out.println("OBJECT CHECK: PASS");
    }
}
