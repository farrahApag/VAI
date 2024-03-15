package VAIS;

public class Service {
    private String serviceName;
    private int billedHours;

    public Service(String serviceName, int billedHours) {
        this.serviceName = serviceName;
        this.billedHours = billedHours;
    }

    public String getServiceName() {
        return serviceName;
    }

    public int getBilledHours() {
        return billedHours;
    }

    public void setBilledHours(int billedHours) {
        this.billedHours = billedHours;
    }

    @Override
    public String toString() {
        return "Service Name: " + serviceName +
                ", Billed Hours: " + billedHours;
    }
}