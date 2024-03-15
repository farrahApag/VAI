//package VAIS;

import java.util.Scanner;
public class Menu {
    public static void main(String [] args) {
    	Scanner scanner = new Scanner(System.in);
    	int choice;
    	
    	do {
    		System.out.println("");
        	System.out.println("-------------------------");
    		System.out.println("Menu");
    		 System.out.println("1. Client Management");
             System.out.println("2. Service Management");
             System.out.println("3. Invoice Management");
             System.out.println("4. Analytics");
             System.out.println("5. Others");
             System.out.println("0. Exit");
             System.out.println("");
             System.out.print("Enter your choice: ");
             choice = scanner.nextInt();

             switch (choice) {
             
             case 1: 
            	 System.out.println("");
            	 System.out.println("Redirecting to Client Management...");
            	 ClientManagementSystem clientManagementSystem = new ClientManagementSystem();
                 clientManagementSystem.startClientManagement(); // Assuming there's a method to start client management
                 break;
                
             case 2:
                 System.out.println("Redirecting to Service Management...");
                 // Call service management method or class here
                 break;
                 
             case 3:
                 System.out.println("Redirecting to Invoice Management...");
                 // Call invoice management method or class here
                 break;
                 
             case 4:
                 System.out.println("Redirecting to Analytics...");
                 // Call analytics method or class here
                 break;
                 
             case 5:
                 System.out.println("Redirecting to Others...");
                 // Call other functionalities or classes here
                 break;
                 
             case 0:
                 System.out.println("Exiting program...");
                 break;
             default:
                 System.out.println("Invalid choice! Please enter a valid option.");
         }
    	}while (choice != 0);
 
    	scanner.close();
}
}
