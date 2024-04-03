package VAIS;
import java.util.Scanner;

public class AnalyticsManager {
    public void displayMenu(Scanner scanner) {
        System.out.println("Analytics:");
        System.out.println("1. Total income analytics for a given period");
        System.out.println("2. Most popular service analytics for a given period");
        System.out.println("3. Top client analytics for a given period");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        switch (choice) {
            case 1:
                totalIncomeAnalytics(scanner);
                break;
            case 2:
                mostPopularServiceAnalytics(scanner);
                break;
            case 3:
                topClientAnalytics(scanner);
                break;
            case 0:
                Menu menu = new Menu();
                menu.startMenu();
                break;
            default:
                System.out.println("Invalid choice! Please enter a number between 1 and 3.");
        }
    }

    private void totalIncomeAnalytics(Scanner scanner) {
        System.out.println("Enter start date (YYYY-MM-DD): ");
        String startDate = scanner.nextLine();
        System.out.println("Enter end date (YYYY-MM-DD): ");
        String endDate = scanner.nextLine();

        // Perform total income analytics calculation based on the provided date range
        double totalIncome = calculateTotalIncome(startDate, endDate);
        System.out.println("Total income for the period " + startDate + " to " + endDate + ": $" + totalIncome);
    }

    private void mostPopularServiceAnalytics(Scanner scanner) {
        System.out.println("Enter start date (YYYY-MM-DD): ");
        String startDate = scanner.nextLine();
        System.out.println("Enter end date (YYYY-MM-DD): ");
        String endDate = scanner.nextLine();

        // Perform most popular service analytics calculation based on the provided date range
        String mostPopularService = calculateMostPopularService(startDate, endDate);
        System.out.println("Most popular service for the period " + startDate + " to " + endDate + ": " + mostPopularService);
    }

    private void topClientAnalytics(Scanner scanner) {
        System.out.println("Enter start date (YYYY-MM-DD): ");
        String startDate = scanner.nextLine();
        System.out.println("Enter end date (YYYY-MM-DD): ");
        String endDate = scanner.nextLine();

        // Perform top client analytics calculation based on the provided date range
        String topClient = calculateTopClient(startDate, endDate);
        System.out.println("Top client for the period " + startDate + " to " + endDate + ": " + topClient);
    }

    private double calculateTotalIncome(String startDate, String endDate) {
        // Placeholder for actual total income calculation based on date range
        return 5000.0; // Placeholder value
    }

    private String calculateMostPopularService(String startDate, String endDate) {
        // Placeholder for actual most popular service calculation based on date range
        return "Service XYZ"; // Placeholder value
    }

    private String calculateTopClient(String startDate, String endDate) {
        // Placeholder for actual top client calculation based on date range
        return "Client ABC"; // Placeholder value
    }
}
