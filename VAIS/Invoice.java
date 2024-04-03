package VAIS;

    import java.util.ArrayList;
    import java.util.List;
    
    public class Invoice {
        private int invoiceId;
        private String clientName;
        private List<Service> services;
        private double totalAmount;
    
        public Invoice(int invoiceId, String clientName, String serviceName, int hours, double amount) {
            this.invoiceId = invoiceId;
            this.clientName = clientName;
            this.services = new ArrayList<>();
            this.totalAmount = 0.0;
        }
    
        public int getInvoiceId() {
            return invoiceId;
        }
    
        public String getClientName() {
            return clientName;
        }
    
        public double getTotalAmount() {
            return totalAmount;
        }
    
        public void addService(String serviceName, int getRatePerHour, double amount) {
            services.add(new Service(serviceName, getRatePerHour));
            totalAmount += amount;
        }
    
        public void updateServiceHours(String serviceName, int newHours) {
            for (Service service : services) {
                if (service.getServiceName().equalsIgnoreCase(serviceName)) {
                    totalAmount -= service.getRatePerHour(); // Subtract old amount
                    service.setHours(newHours);
                    totalAmount += service.getRatePerHour(); // Add new amount
                    break;
                }
            }
        }
    
        public List<Service> getServices() {
            return services;
        }
    
        @Override
        public String toString() {
            return "Invoice ID: " + invoiceId +
                    ", Client: " + clientName +
                    ", Total Amount: $" + totalAmount +
                    ", Services: " + services;
        }
    }   
