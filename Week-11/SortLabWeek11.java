import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class SortLabWeek11 {
    public static void main(String[] args) throws IOException {
        Path file = Path.of("sortlab_snapshot.csv");
        List<String> rows = List.of("station,tokens", "ASTER,5", "BERYL,4", "COBALT,3");
        Files.write(file, rows, StandardCharsets.UTF_8);
        List<String> restored = Files.readAllLines(file, StandardCharsets.UTF_8);
        System.out.println("FILE_CREATED: " + file.getFileName());
        System.out.println("ROWS_READ: " + (restored.size() - 1));
        System.out.println("FILE_CHECK: " + (rows.equals(restored) ? "PASS" : "FAIL"));
    }
}
