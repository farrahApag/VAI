//package VAI;

import java.util.Scanner;
import java.util.Map;

public class Client {
	 private String name;
	    private double totalBilledAmount;

	    public Client(String name) {
	        this.name = name;
	        this.totalBilledAmount = 0.0;
	    }

	    public String getName() {
	        return name;
	    }

	    public double getTotalBilledAmount() {
	        return totalBilledAmount;
	    }

	    public void updateTotalBilledAmount(double amount) {
	        totalBilledAmount += amount;
	    }

	    @Override
	    public String toString() {
	        return "Client Name: " + name + "\nTotal Billed Amount: $" + totalBilledAmount;
	    }
	}

	