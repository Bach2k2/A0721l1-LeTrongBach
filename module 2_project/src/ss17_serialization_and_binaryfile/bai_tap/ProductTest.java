package ss17_serialization_and_binaryfile.bai_tap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductTest {
    public int amount = 0;
    public int _id = 100;
    List<Product> ProductLists = new ArrayList<>();

    private class Product implements Comparable<Product> {
        private int id;
        private String name;
        private String label;
        private double price;

        public Product(String name, String label, double price) {
            this.id = _id++;
            this.name = name;
            this.label = label;
            this.price = price;
        }

        public Product(Product product) {
            this.clone(product);
        }

        private void clone(Product product) {
            this.id = product.id;
            this.name = product.name;
            this.label = product.label;
            this.price = product.price;
        }

        @Override
        public String toString() {
            return "Product with id= " + this.id + ", Name : " + this.name +
                    ", Label: " + this.label +
                    ", price: " + this.price;
        }

        @Override
        public int compareTo(Product object) {
            return (int) (this.price - object.price);
        }
        public int compareWithId(Product object) {
            return  (this.id - object.id);
        }
    }

    public void add(String name, String label, double price) {
        Product product = new Product(name, label, price);
        ProductLists.add(product);
        amount++;
    }

    public void update(int id, String name, String label, double price) {
        Product editone = getProduct(id);
        editone.name = name;
        editone.label = label;
        editone.price = price;
    }

    public Product getProduct(int id) {
        for (int i = 0; i < ProductLists.size(); i++) {
            if (ProductLists.get(i).id == id)
                return ProductLists.get(i);
        }
        return null;
    }

    public void SearchByName(String name) {
        for (int i = 0; i < ProductLists.size(); i++) {
            if (ProductLists.get(i).name.equals(name)) {
                Product product = ProductLists.get(i);
                System.out.println(product.toString());
            }
        }
    }

    public void display() {
        for (int i = 0; i < amount; i++) {
            System.out.println(ProductLists.get(i).toString());
        }
    }

    public void delete(int id) {
        Product product = getProduct(id);
        ProductLists.remove(product);
        amount--;
    }

    public void sortByPrice() {

        ProductLists.sort(Product::compareTo);
        display();
    }
    public void sortById() {
        ProductLists.sort(Product::compareWithId);
    }
}

class Main {

    public static void main(String[] args) {
        ProductTest productService = new ProductTest();
        productService.add("VS", "MS", 100.75);
        productService.display();
        menu(productService);
    }

   public static void menu(ProductTest productService) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n|-------Menu-------");
        System.out.println("|1.Add a product.");
        System.out.println("|2.Update a product");
        System.out.println("|3.Search a product by name");
        System.out.println("|4.Delete a product");
        System.out.println("|5.SortByPrice");
        System.out.println("|6.Display");
        System.out.println("|0.Exit");
       System.out.println("_____________________________________");
        int choice;
        do {
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Nhập tên của sản phẩm cần thêm: ");
                    scanner.nextLine();
                    String name = scanner.nextLine();
                    System.out.println("Nhập hãng của sản phẩm cần thêm: ");
                    String label = scanner.nextLine();
                    System.out.println("Nhập giá của sản phẩm cần thêm: ");
                    double price = scanner.nextDouble();
                    productService.add(name, label, price);
                    break;
                }
                case 2: {
                    System.out.println("\n Nhập id cua product can sua");
                    int idProduct = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("\nNhập tên mới: ");
                    String name = scanner.nextLine();
                    System.out.println("\nNhập nhãn mới: ");
                    String label = scanner.nextLine();
                    System.out.println("\nNhập giá mới: ");
                    double price = scanner.nextDouble();
                    productService.update(idProduct, name, label, price);
                    break;
                }
                case 3: {
                    System.out.println("\n Nhập tên cần search: ");
                    String name = scanner.nextLine();
                    productService.SearchByName(name);
                    break;
                }
                case 4: {
                    System.out.println("\n Nhập id của sản phẩm cần xóa");
                    int idProduct = scanner.nextInt();
                    productService.delete(idProduct);
                    break;
                }
                case 5:
                {
                    System.out.println("\nSắp xếp theo giá: ");
                    productService.sortByPrice();
                    break;
                }
                case 6:
                {
                    productService.sortById();;
                    productService.display();
                    break;
                }
                case 0: {
                    System.out.println("");
                    break;
                }
                default:
                {
                    System.out.println("Lựa chọn bạn không hợp lệ, mời nhập lại: ");
                    break;
                }
            }

        } while (choice !=0);
    }
}
