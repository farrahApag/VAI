package VAIS;
//package VAI;

public class Client {
	 private String ClientName;
	    private double totalBilledAmount;

	    public Client(String ClientName) {
	        this.ClientName = ClientName;
	        this.totalBilledAmount = 0.0;
	    }

	    public String getClientName() {
	        return ClientName;
	    }

	    public double getTotalBilledAmount() {
	        return totalBilledAmount;
	    }

	    public void updateTotalBilledAmount(double amount) {
	        totalBilledAmount += amount;
	    }

	    @Override
	    public String toString() {
	        return "Client Name: " + ClientName + "\nTotal Billed Amount: $" + totalBilledAmount;
	    }
	}

	