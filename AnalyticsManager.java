import java.util.Scanner;

public class AnalyticsManager {
    public void displayMenu(Scanner scanner) {
        System.out.println("Analytics:");
        System.out.println("1. Total income analytics for a given period");
        System.out.println("2. Most popular service analytics for a given period");
        System.out.println("3. Top client analytics for a given period");
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
            default:
                System.out.println("Invalid choice! Please enter a number between 1 and 3.");
        }
    }

    private void totalIncomeAnalytics(Scanner scanner) {
        // Implement total income analytics for a given period
        System.out.println("Total income analytics");
    }
}
