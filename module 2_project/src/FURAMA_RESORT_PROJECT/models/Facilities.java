package FURAMA_RESORT_PROJECT.models;

public class Facilities {
    protected String serviceName;
    protected int area;
    protected double price;
    protected int maxAmount;

    public Facilities()
    {}
    public Facilities(String serviceName, int area, double price, int maxAmount) {
        this.serviceName = serviceName;
        this.area = area;
        this.price = price;
        this.maxAmount = maxAmount;
    }

    public void rent(int choice) {
        System.out.println("Function: rent");
        switch (choice)
        {
         case 1-> System.out.println("Rent by year");
         case 2-> System.out.println("Rent by month");
         case 3-> System.out.println("Rent by day");
         case 4-> System.out.println("Rent by hour");
         default -> System.out.println("No choice");
        }

    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }


    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
