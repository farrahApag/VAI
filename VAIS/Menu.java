package VAIS;

import java.util.Scanner;

import VAIS.ClientManagementSystem;
import VAIS.InvoiceManagement;
import VAIS.ServiceManagement;

public class Menu {
        public void startMenu() {
                Scanner scanner = new Scanner(System.in);
                int choice;

                do {
                        System.out.println("");
                        System.out.println("-------------");
                        System.out.println("Menu");
                        System.out.println("1. Client Management");
                        System.out.println("2. Serviice Mangement");
                        System.out.println("3. Invoice Mangement");
                        System.out.println("4. Analytic");
                        System.out.println("5. Additional Features");
                        System.out.print("Choose a number:");
                        choice = scanner.nextInt();

                        switch (choice) {
                                case 1:
                                        ClientManagementSystem clientManagement = new ClientManagementSystem();
                                        clientManagement.startClientManagement();
                                        break;
                                case 2:
                                        // Instantiate and run ServiceManagement class
                                        ServiceManagement serviceManagement = new ServiceManagement();
                                        serviceManagement.startServiceManagement();
                                        break;
                                case 3:
                                        InvoiceManagement invoiceManagement = new InvoiceManagement();
                                        invoiceManagement.startInvoiceManagement();
                                        break;
                                case 4:
                                        // AnalyticsManager analyticsManager = new AnalyticsManager();
                                        // analyticsManager.startAnalyticsManager();
                                        break;
                                case 5:
                                        AdditionalFeatures additionaFeatures = new AdditionalFeatures();
                                        additionaFeatures.displayMenu(scanner);
                                        break;
                        }
                } while (choice != 0);
        }

        public static void main(String[] args) {
                Menu menuInstance = new Menu();
                menuInstance.startMenu(); // Start the menu system
        }
}