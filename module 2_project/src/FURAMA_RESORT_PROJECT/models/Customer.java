package FURAMA_RESORT_PROJECT.models;

public class Customer extends Person{
   private int MKH;
   private String type;
   private String address;
   private static int takeValue=100;
   private void increaseId()
   {
       this.MKH=takeValue++;
   }
    public Customer(String name, String dateOfBirth, boolean gender, String CMND, String email, String phoneNum, String type, String address) {
        super(name, dateOfBirth, gender, CMND, email, phoneNum);
        increaseId();
        this.type = type;
        this.address = address;
    }
    public String getName()
    {
        return this.name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "MKH=" + MKH +
                ", type='" + type + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
