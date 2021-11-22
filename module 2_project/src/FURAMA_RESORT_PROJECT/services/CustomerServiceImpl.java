package FURAMA_RESORT_PROJECT.services;

import FURAMA_RESORT_PROJECT.models.Customer;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    public static List<Customer> customerList = new LinkedList<>();
    Scanner scanner = new Scanner(System.in);

    public void addCustomer(Customer customer) {
        customerList.add(customer);
    }


    public void updateObj(String name, int choice) {
        Customer updateOne;
        for (Customer customer : customerList) {
            if (customer.getName().equals(name)) {
                updateOne = customer;
                break;
            }
        }
        switch (choice) {
            case 1: {
                String newName;
                do {
                    System.out.println("Edit Name!\n New name:");
                    newName = scanner.nextLine();
                    if (newName.equals("")) System.out.println("Nhập lại nhé:");
                } while (newName.equals(""));
                break;

            }
            case 2: {
                String newEmail;
                do {
                    System.out.println("Edit Name!\n New name:");
                    newEmail = scanner.nextLine();
                    if (newEmail.equals("")) System.out.println("Nhập lại nhé:");
                } while (newEmail.equals(""));
                break;

            }
            case 3: {
                String newPhoneNum;
                do {
                    System.out.println("Edit Name!\n New name:");
                    newPhoneNum = scanner.nextLine();
                    if (newPhoneNum == "") System.out.println("Nhập lại nhé:");
                } while (newPhoneNum == "");
                break;
            }
            case 4: {
                String newAdress;
                do {
                    System.out.println("Edit Level!\n New level:");
                    newAdress = scanner.nextLine();
                    if (newAdress == "") System.out.println("Nhập lại nhé:");
                } while (newAdress == "");
                break;
            }
            case 5: {
                String newType;
                do {
                    System.out.println("Edit Name!\n New name:");
                    newType = scanner.nextLine();
                    if (newType == "") System.out.println("Nhập lại nhé:");
                } while (newType == "");
                break;
            }
            default: {
                System.out.println("Sai lua chon");
                break;
            }
        }
    }


    public boolean searchObj(String name) {
        for (Customer customer : customerList) {
            if (customer.getName().equals(name)) return true;
        }
        return false;
    }


    public void deleteObj(String name) {
        for (Customer customer : customerList) {
            if (customer.getName().equals(name)) {
                customerList.remove(customer);
                return;
            }
        }
    }


    public int indexObj(String name) {
        int index = -1;
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getName().equals(name)) {
                index = i;
                break;
            }
        }
        return index;
    }

    @Override
    public void displayList() {
        for (Customer customer : customerList) {
            System.out.println(customer.toString());
        }
    }
}
