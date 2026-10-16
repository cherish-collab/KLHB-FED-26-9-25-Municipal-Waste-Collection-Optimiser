public class SortLabWeek04 {
    public static void main(String[] args) {
        String[] commands = {"SHOW", "ADD 2", "QUIT"};
        int tokens = 12;
        for (String command : commands) {
            System.out.println("COMMAND: " + command);
            if (command.equals("ADD 2")) {
                tokens += 2;
            }
        }
        System.out.println("FINAL TOKENS: " + tokens);
        System.out.println("STATE: CLOSED");
    }
}
