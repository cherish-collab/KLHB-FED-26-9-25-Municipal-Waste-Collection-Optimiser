public class SortLabWeek10 {
    static class InvalidTokenInputException extends Exception {
        InvalidTokenInputException(String message) {
            super(message);
        }
    }

    static int parse(String text) throws InvalidTokenInputException {
        if (!text.matches("[0-9]+")) {
            throw new InvalidTokenInputException("token value must be numeric");
        }
        return Integer.parseInt(text);
    }

    public static void main(String[] args) {
        int fallback = 3;
        try {
            parse("N/A");
        } catch (InvalidTokenInputException exception) {
            System.out.println("INVALID: N/A");
            System.out.println("FALLBACK: " + fallback);
            System.out.println("CONTINUED: true");
        }
    }
}
