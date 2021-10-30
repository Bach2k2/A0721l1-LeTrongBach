package ss12_java_collection_framework.bai_tap;

public class Product {
    private static int generateId=1;
    private int id;
    private String name;
    private double price;

    public Product() {
    }

    public Product(String name, double price) {
        this.id=generateId++;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public int compareTo1(Product o) {
        return (int) (this.price-o.getPrice());
    }
    public int compareTo2(Product o) {
        return (int) (o.getPrice()-this.price);
    }


}

