import java.util.Scanner;

public class InvoiceManager {
    public void displayMenu(Scanner scanner) {
        System.out.println("Invoice Management:");
        System.out.println("1. Create new invoice");
        System.out.println("2. Add services to an invoice");
        System.out.println("3. Update hours of service in an invoice");
        System.out.println("4. Delete an invoice");
        System.out.println("5. View all invoices for a particular client");
        System.out.println("6. View total amount for each invoice");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        switch (choice) {
            case 1:
                createInvoice(scanner);
                break;
            case 2:
                addServicesToInvoice(scanner);
                break;
            case 3:
                updateInvoiceHours(scanner);
                break;
            case 4:
                deleteInvoice(scanner);
                break;
            case 5:
                viewAllInvoicesForClient(scanner);
                break;
            case 6:
                viewTotalAmountForInvoice(scanner);
                break;
            default:
                System.out.println("Invalid choice! Please enter a number between 1 and 6.");
        }
    }

    private void createInvoice(Scanner scanner) {
        // Implement creating a new invoice
        System.out.println("Creating a new invoice...");
    }

    private void addServicesToInvoice(Scanner scanner) {
        // Implement adding services to an invoice
        System.out.println("Adding services to an invoice...");
    }

    private void updateInvoiceHours(Scanner scanner) {
        // Implement updating hours of service in an invoice
        System.out.println("Updating hours of service in an invoice...");
    }

    private void deleteInvoice(Scanner scanner) {
        // Implement deleting an invoice
        System.out.println("Deleting an invoice...");
    }

    private void viewAllInvoicesForClient(Scanner scanner) {
        // Implement viewing all invoices for a particular client
        System.out.println("Viewing all invoices for a particular client...");
    }

    private void viewTotalAmountForInvoice(Scanner scanner) {
        // Implement viewing total amount for each invoice
        System.out.println("Viewing total amount for each invoice...");
    }
}
