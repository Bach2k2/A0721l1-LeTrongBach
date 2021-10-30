package ss12_java_collection_framework.bai_tap;

import java.util.Scanner;

public class ProductTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ProductManagement productManagement = new ProductManagement();
        System.out.println("Nhap so luong san pham ban dau: ");
        int amount = input.nextInt();
        for (int i = 0; i < amount; i++) {
            System.out.println("Nhap ten: ");
            input.nextLine();
            String name = input.nextLine();
            System.out.println("Nhap gia");
            double price = input.nextDouble();
            productManagement.add(name, price);
        }
        productManagement.display();
        Menu(productManagement);
    }

    public static void Menu(ProductManagement productManagement) {
        System.out.println("--------------------Menu----------------------");
        System.out.println("1. Thêm sản phẩm");
        System.out.println("2. Xóa sản phẩm ");
        System.out.println("3. In sản phẩm");
        System.out.println("4. Sửa sản phẩm");
        System.out.println("5. Sắp xếp sản phẩm theo tăng dần của giá");
        System.out.println("6. Sắp xếp sản phẩm theo giảm dần của giá");
        System.out.println("7. Tìm kiếm sản phẩm");
        System.out.println("0. Thoát");
        Scanner input = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Nhập lựa chọn: ");
            choice = input.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Nhap ten: ");
                    input.nextLine();
                    String name = input.nextLine();
                    System.out.println("Nhap gia");
                    double price = input.nextDouble();
                    productManagement.add(name, price);
                    break;
                }
                case 2: {
                    System.out.println("Nhập id cần xóa:");
                    int id = input.nextInt();
                    productManagement.delete(id);
                    break;
                }
                case 3: {
                    productManagement.display();
                    break;
                }
                case 4: {
                    System.out.println("Nhập id cần sửa:");
                    int id = input.nextInt();
                    System.out.println("Nhap ten can sua: ");
                    input.nextLine();
                    String name = input.nextLine();
                    System.out.println("Nhap gia can sua: ");
                    double price = input.nextDouble();
                    productManagement.update(id, name, price);
                    break;
                }
                case 5: {
                    productManagement.increaseSort();
                    break;
                }
                case 6: {
                    productManagement.decreaseSort();
                    break;
                }
                case 7: {
                    System.out.println("Nhap ten can tìm kiếm: ");
                    input.nextLine();
                    String name = input.nextLine();
                    Product product1 = productManagement.searchByName(name);
                    System.out.println(product1.toString());
                    break;
                }
                case 0:
                    System.out.println("Good bye. See you again!");
                    break;
                default: {
                    System.out.println("Mời nhập lại: ");
                    break;
                }
            }
        } while (choice != 0);

    }
}
