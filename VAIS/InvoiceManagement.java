package VAIS;import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class InvoiceManagement{

    private Map<Integer, Invoice> invoices = new HashMap<>();
    private Scanner scanner = new Scanner(System.in);
    private int nextInvoiceId = 1;

    public void startInvoiceManagement() {
        int choice;
        do {
            System.out.println("");
            System.out.println("-------------------------");
            System.out.println("Invoice Management System");
            System.out.println("1. Create New Invoice");
            System.out.println("2. Add Services to an Invoice");
            System.out.println("3. Update Hours of Service in an Invoice");
            System.out.println("4. Delete an Invoice");
            System.out.println("5. View All Invoices for a Client");
            System.out.println("6. View Total Amount for Each Invoice");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    createNewInvoice();
                    break;
                case 2:
                    addServiceToInvoice();
                    break;
                case 3:
                    updateHoursInInvoice();
                    break;
                case 4:
                    deleteInvoice();
                    break;
                case 5:
                    viewInvoicesForClient();
                    break;
                case 6:
                    viewTotalAmountForInvoices();
                    break;
                case 0:
                    System.out.println("Exiting invoice management...");
                    Menu menu = new Menu();
                    menu.startMenu();
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
        } while (choice != 0);

        scanner.close();
    }

    private void createNewInvoice() {
        System.out.print("Enter client name: ");
        String clientName = scanner.next();
        System.out.print("Enter service name: ");
        String serviceName = scanner.next();
        System.out.print("Enter hours: ");
        int hours = scanner.nextInt();
        System.out.print("Enter amount: $");
        double amount = scanner.nextDouble();
        invoices.put(nextInvoiceId, new Invoice(nextInvoiceId, clientName, serviceName, hours, amount));
        nextInvoiceId++;
        System.out.println("Invoice created successfully!");
    }

    private void addServiceToInvoice() {
        System.out.print("Enter invoice ID: ");
        int invoiceId = scanner.nextInt();
        if (invoices.containsKey(invoiceId)) {
            System.out.print("Enter additional service name: ");
            String serviceName = scanner.next();
            System.out.print("Enter additional hours: ");
            int hours = scanner.nextInt();
            System.out.print("Enter additional amount: $");
            double amount = scanner.nextDouble();
            invoices.get(invoiceId).addService(serviceName, hours, amount);
            System.out.println("Service added to invoice successfully!");
        } else {
            System.out.println("Invoice not found!");
        }
    }

    private void updateHoursInInvoice() {
        System.out.print("Enter invoice ID: ");
        int invoiceId = scanner.nextInt();
        if (invoices.containsKey(invoiceId)) {
            System.out.print("Enter service name to update hours: ");
            String serviceName = scanner.next();
            System.out.print("Enter new hours: ");
            int newHours = scanner.nextInt();
            invoices.get(invoiceId).updateServiceHours(serviceName, newHours);
            System.out.println("Hours updated in invoice successfully!");
        } else {
            System.out.println("Invoice not found!");
        }
    }

    private void deleteInvoice() {
        System.out.print("Enter invoice ID to delete: ");
        int invoiceId = scanner.nextInt();
        if (invoices.containsKey(invoiceId)) {
            invoices.remove(invoiceId);
            System.out.println("Invoice deleted successfully!");
        } else {
            System.out.println("Invoice not found!");
        }
    }

    private void viewInvoicesForClient() {
        System.out.print("Enter client name: ");
        String clientName = scanner.next();
        System.out.println("Invoices for client '" + clientName + "':");
        boolean found = false;
        for (Invoice invoice : invoices.values()) {
            if (invoice.getClientName().equalsIgnoreCase(clientName)) {
                System.out.println(invoice);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No invoices found for client '" + clientName + "'.");
        }
    }

    private void viewTotalAmountForInvoices() {
        System.out.println("Total amount for each invoice:");
        for (Invoice invoice : invoices.values()) {
            System.out.println("Invoice ID: " + invoice.getInvoiceId() +
                    ", Client: " + invoice.getClientName() +
                    ", Total Amount: $" + invoice.getTotalAmount());
        }
    }

    public static void main(String[] args) {
        InvoiceManagement invoiceManagement = new InvoiceManagement();
        invoiceManagement.startInvoiceManagement();
    }
}