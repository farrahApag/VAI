package VAIS;

public class Service {
    private String serviceName;
    private int RatePerHour;
    private int hours;

    public Service(String serviceName, int RatePerHour) {
        this.serviceName = serviceName;
        this.RatePerHour = RatePerHour;
        this.hours = 0; // Initialize hours to 0 this.hours = 0; // Initialize hours to 0
    }

    public String getServiceName() {
        return serviceName;
    }

    public int getRatePerHour() {
        return RatePerHour;
    }

    public void getRatePerHour(int RatePerHours) {
        this.RatePerHour = RatePerHours;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
    @Override
    public String toString() {
        return "Service Name: " + serviceName +
        ", Rate Per Hour: " + RatePerHour +
        ", Hours: " + hours;
}

public double getAmount() {
return hours * RatePerHour;
}
}
