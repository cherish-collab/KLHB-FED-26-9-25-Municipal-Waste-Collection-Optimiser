import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class SortLabWeek12 {
    static class Station {
        final String label;
        final int tokens;

        Station(String label, int tokens) {
            this.label = label;
            this.tokens = tokens;
        }
    }

    public static void main(String[] args) {
        List<Station> stations = new ArrayList<>(List.of(
            new Station("ASTER", 5),
            new Station("BERYL", 4),
            new Station("COBALT", 3)
        ));
        List<Station> ordered = stations.stream()
            .sorted(Comparator.comparing(station -> station.label))
            .collect(Collectors.toList());
        int total = stations.stream().mapToInt(station -> station.tokens).sum();
        double average = stations.stream().mapToInt(station -> station.tokens).average().orElse(0.0);
        String labels = ordered.stream().map(station -> station.label).collect(Collectors.joining(","));

        System.out.println("FINAL CLASSROOM SORTLAB REPORT");
        System.out.println("STATIONS: " + stations.size());
        System.out.println("TOTAL_TOKENS: " + total);
        System.out.println("AVERAGE_TOKENS: " + String.format(Locale.ROOT, "%.2f", average));
        System.out.println("TOP_STATION: ASTER");
        System.out.println("ORDERED_LABELS: " + labels);
    }
}
