package FuramaResortOfBach.models;

public class Facilities {
    protected String serviceName;
    protected int area;
    protected double price;
    protected int maxAmount;
    protected String rentType;
    public Facilities()
    {}
    public Facilities(String serviceName, int area, double price, int maxAmount,String rentType) {
        this.serviceName = serviceName;
        this.area = area;
        this.price = price;
        this.maxAmount = maxAmount;
        this.rentType= rentType;
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

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType;
    }
}
