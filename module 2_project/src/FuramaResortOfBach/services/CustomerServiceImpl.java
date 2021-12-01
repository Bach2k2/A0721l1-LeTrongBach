package FuramaResortOfBach.services;

import FuramaResortOfBach.models.Customer;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    public static List<Customer> customerList = new LinkedList<>();
    static int customerAmount = 0;
    Scanner scanner = new Scanner(System.in);


    @Override
    public void display() {
        for (Customer customer : customerList) {
            System.out.println(customer.toString());
        }
    }
    @Override
    public void addNew() {
        System.out.println("Nhập tên :");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi :");
        String dateOfBirth = scanner.nextLine();
        System.out.println("Nhập giới tính");
        boolean gender = scanner.hasNext();
        System.out.println("Nhập số cmnd");
        int personId = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số điện thoại:");
        String phoneNum = scanner.nextLine();
        System.out.println("Nhập email:");
        String email = scanner.nextLine();
        System.out.println("Nhập loại khách hàng:");
        String type = scanner.nextLine();
        System.out.println("Nhập số đia chỉ:");
        String address = scanner.nextLine();
        Customer customer = new Customer(name,dateOfBirth,gender,personId,email,phoneNum,type,address);
        customerList.add(customer);
        customerAmount++;
    }

    @Override
    public void update() {
        System.out.println("Nhập id cần update: ");
        int personId = Integer.parseInt(scanner.nextLine());
        Customer updateOne=new Customer() ;
        for (Customer customer : customerList) {
            if (customer.getPersonId() == personId) {
                updateOne = customer;
                break;
            }
        }
        String newName;
        do {
            System.out.println("Edit Name!\n New name:");
            newName = scanner.nextLine();
            if (newName.equals("")) System.out.println("Nhập lại nhé:");
        } while (newName.equals(""));
        updateOne.setName(newName);
        String newEmail;
        do
        {
            System.out.println("Edit Email!\n New email:");
            newEmail = scanner.nextLine();
            if (newEmail.equals("")) System.out.println("Nhập lại nhé:");
        } while(newEmail.equals(""));
        String newPhoneNum;
        {
            System.out.println("Edit phoneNum\n New phone Num:");
            newPhoneNum = scanner.nextLine();
            if (Objects.equals(newPhoneNum, "")) System.out.println("Nhập lại nhé:");
        } while(newPhoneNum =="");
        String type;
        do
        {
            System.out.println("Edit type!\n New type:");
            type = scanner.nextLine();
            if (type == "") System.out.println("Nhập lại nhé:");
        } while(type =="");

    }

    @Override
    public void delete() {
        System.out.println("Nhập tên cần xóa");
        String name = scanner.nextLine();
        for (Customer customer : customerList) {
            if (customer.getName().equals(name)) {
                customerList.remove(customer);
                break;
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

    public boolean search(String name) {
        for (Customer customer : customerList) {
            if (customer.getName().equals(name)) return true;
        }
        return false;
    }

}
