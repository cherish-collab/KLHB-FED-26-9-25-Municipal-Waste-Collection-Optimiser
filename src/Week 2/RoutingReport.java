public class RoutingReport {
    public static void main(String[] args) {

        String route = "Route A";
        boolean diverted = true;
        String reason = "Road Block";

        System.out.println("=== Routing and Diversion Report ===");
        System.out.println("Route: " + route);

        if (diverted) {
            System.out.println("Status: Diverted");
            System.out.println("Reason: " + reason);
        } else {
            System.out.println("Status: Normal Route");
        }
    }
}