package ss12_java_collection_framework.bai_tap;

import java.util.ArrayList;

public class ProductManagement {
    ArrayList<Product> productList = new ArrayList<>();

    public void add(String name, double price) {
        Product product = new Product(name, price);
        productList.add(product);
    }

    public void update(int id, String name, double price) {
        Product product = getProduct(id);
        product.setName(name);
        product.setPrice(price);

    }

    public void delete(int id) {
        Product product = getProduct(id);
        productList.remove(product);
    }

    public void display() {
        for (int i = 0; i < productList.size(); i++) {
            System.out.println(productList.get(i).toString());
        }
    }

    public Product searchByName(String name) {
        for (int i = 0; i < productList.size(); i++) {
            if (name.compareTo(productList.get(i).getName()) == 0) return productList.get(i);
        }
        System.out.println("Khong co san pham nay");
        return null;
    }

    public Product getProduct(int id) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) return productList.get(i);
        }
        return null;
    }

    public void increaseSort() {
        productList.sort(Product::compareTo1);
    }
    public void decreaseSort() {
        productList.sort(Product::compareTo2);
    }
}

