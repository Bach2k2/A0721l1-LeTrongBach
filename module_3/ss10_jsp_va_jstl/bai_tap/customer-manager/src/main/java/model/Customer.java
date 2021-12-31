package model;

public class Customer {
    private String name;
    private String birth;
    private String address;
    private String image;

    public Customer(String name, String birth, String address, String image) {
        this.name = name;
        this.birth = birth;
        this.address = address;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getBirth() {
        return birth;
    }

    public String getAddress() {
        return address;
    }

    public String getImage() {
        return image;
    }
}
