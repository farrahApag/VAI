package VAIS;
// package VAIS;

import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class ClientMangementSystem {

	 private Map<String, Client> clients = new HashMap<>();
	    private Scanner scanner = new Scanner(System.in);

	    public void startClientManagement() {
	        int choice;
	        do {
	        	System.out.println("");
	        	System.out.println("-------------------------");
	            System.out.println("Client Management System");
	            System.out.println("1. Add New Client");
	            System.out.println("2. View Client Details");
	            System.out.println("3. Update Client Information");
	            System.out.println("4. Delete Client");
	            System.out.println("5. View Total Billed Amount for Each Client");
	            System.out.println("0. Exit");
	            System.out.print("Enter your choice: ");
	            choice = scanner.nextInt();
	            
	            
	            switch (choice) {
	                case 1:
	                    addNewClient();
	                    break;
	                case 2:
	                    viewClientDetails();
	                    break;
	                case 3:
	                    updateClientInformation();
	                    break;
	                case 4:
	                    deleteClient();
	                    break;
	                case 5:
	                    viewTotalBilledAmount();
	                    break;
	                case 0:
	                    System.out.println("Exiting client management...");
	                    System.out.print("");
	                    break;
	                default:
	                    System.out.println("Invalid choice! Please enter a valid option.");
	                    System.out.print("");
	            }
	        } while (choice != 0);

	        scanner.close();
	    }

	    private void addNewClient() {
	        System.out.print("Enter client name: ");
	        String name = scanner.next();
	        clients.put(name, new Client(name));
	        System.out.println("Client added successfully!");
	    }

	    private void viewClientDetails() {
	        System.out.print("Enter client name: ");
	        String name = scanner.next();
	        if (clients.containsKey(name)) {
	            System.out.println(clients.get(name));
	        } else {
	            System.out.println("Client not found!");
	            System.out.print("");
	        }
	    }

	    private void updateClientInformation() {
	        System.out.print("Enter client name: ");
	        String name = scanner.next();
	        if (clients.containsKey(name)) {
	            System.out.print("Enter new billed amount: $");
	            double amount = scanner.nextDouble();
	            clients.get(name).updateTotalBilledAmount(amount);
	            System.out.println("Client information updated successfully!");
	        } else {
	            System.out.println("Client not found!");
	        }
	    }

	    private void deleteClient() {
	        System.out.print("Enter client name: ");
	        String name = scanner.next();
	        if (clients.containsKey(name)) {
	            clients.remove(name);
	            System.out.println("Client deleted successfully!");
	        } else {
	            System.out.println("Client not found!");
	        }
	    }

	    private void viewTotalBilledAmount() {
	        if (clients.isEmpty()) {
	            System.out.println("No clients found!");
	        } else {
	            System.out.println("Total Billed Amount for Each Client:");
	            for (Client client : clients.values()) {
	                System.out.println(client.getClientName() + ": $" + client.getTotalBilledAmount());
	            }
	        }
	    }

	    public static void main(String[] args) {
	        ClientMangementSystem clientManagementSystem = new ClientMangementSystem();
	        clientManagementSystem.startClientManagement();
	    }
	}