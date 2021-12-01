package FuramaResortOfBach.models;

public class Customer extends Person {
   private int customerId;
   private String type;
   private String address;
   private static int takeValue=100;
   private void increaseId()
   {
       this.customerId=takeValue++;
   }


    public Customer() {
    }

    public Customer(String name, String dateOfBirth, boolean gender, int personId, String email, String phoneNum, String type, String address) {
        super(name, dateOfBirth, gender, personId, email, phoneNum);
        increaseId();
        this.type = type;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", type='" + type + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public String getName()
    {
        return this.name;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
