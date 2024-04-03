package VAIS;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ServiceManagement {
    private Map<String, Service> services = new HashMap<>();
    private Scanner scanner = new Scanner(System.in);

    public void startServiceManagement() {
        int choice;
        do {
            System.out.println("");
            System.out.println("-------------------------");
            System.out.println("Service Management System");
            System.out.println("1. Add New Service");
            System.out.println("2. View Service Details");
            System.out.println("3. Update Service Information");
            System.out.println("4. Delete Service");
            System.out.println("5. View Total Billed Hours for Each Service");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addNewService();
                    break;
                case 2:
                    viewServiceDetails();
                    break;
                case 3:
                    updateServiceInformation();
                    break;
                case 4:
                    deleteService();
                    break;
                case 5:
                    viewTotalBilledHours();
                    break;
                case 0:
                    System.out.println("Exiting service management...");
                    Menu menu = new Menu();
                    menu.startMenu();
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
        } while (choice != 0);

        scanner.close();
    }

    private void addNewService() {
        System.out.print("Enter service name: ");
        String serviceName = scanner.next();
        System.out.print("Enter billed hours: ");
        int billedHours = scanner.nextInt();
        services.put(serviceName, new Service(serviceName, billedHours));
        System.out.println("Service added successfully!");
    }

    private void viewServiceDetails() {
        System.out.print("Enter service name: ");
        String serviceName = scanner.next();
        if (services.containsKey(serviceName)) {
            System.out.println(services.get(serviceName));
        } else {
            System.out.println("Service not found!");
        }
    }

    private void updateServiceInformation() {
        System.out.print("Enter service name: ");
        String serviceName = scanner.next();
        if (services.containsKey(serviceName)) {
            System.out.print("Enter new billed hours: ");
            int newBilledHours = scanner.nextInt();
            services.get(serviceName).getRatePerHour(newBilledHours);
            System.out.println("Service information updated successfully!");
        } else {
            System.out.println("Service not found!");
        }
    }

    private void deleteService() {
        System.out.print("Enter service name to delete: ");
        String serviceName = scanner.next();
        if (services.containsKey(serviceName)) {
            services.remove(serviceName);
            System.out.println("Service deleted successfully!");
        } else {
            System.out.println("Service not found!");
        }
    }

    private void viewTotalBilledHours() {
        if (services.isEmpty()) {
            System.out.println("No services found!");
        } else {
            System.out.println("Total Billed Hours for Each Service:");
            for (Service service : services.values()) {
                System.out.println(service.getServiceName() + ": " + service.getRatePerHour() + " hours");
            }
        }
    }

    public static void main(String[] args) {
        ServiceManagement serviceManagement = new ServiceManagement();
        serviceManagement.startServiceManagement();
    }
}
