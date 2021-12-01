package FuramaResortOfBach.controllers;

import FuramaResortOfBach.services.EmployeeServiceImpl;

import java.util.Scanner;

public class MyFuramaController {
    static Scanner scanner = new Scanner(System.in);

    public static void displayMainMenu() {
        boolean check = true;
        while (check) {
            System.out.println("\t\t\tMain menu");
            System.out.println("""
                    \t\t|\t1.Employee Management\t\t\t|
                    \t\t|\t2.Customer Management\t\t\t|
                    \t\t|\t3.Facility Management\t\t\t|
                    \t\t|\t4.Booking Management\t\t\t |
                    \t\t|\t5.Promotion Management\t\t |
                    \t\t|\t 6.Exit\t\t\t\t |""");
            System.out.println("\t\t|---------------------------------------|");
            System.out.println("Nhập lựa chọn :");
            switch (scanner.nextInt()) {
                case 1: {
                    displayEmployeeMenu();
                    break;
                }
                case 2: {
                    break;
                }
                case 3: {
                    break;
                }
                case 4: {

                    break;
                }
                case 5: {

                    break;
                }
                case 6: {
                    check = false;
                    break;
                }
                default:
                    System.out.println("Lựa chọn sai. Mời nhập lại.");
            }

        }
    }

    public static void displayEmployeeMenu() {
        EmployeeServiceImpl employeeService=new EmployeeServiceImpl();
        boolean check = true;
        while (check) {
            System.out.println("\tEmployee menu");
            System.out.println("1.Display list employees\t\t\t\t|\n" +
                    " \t\t|\t2.Add new employee\t\\t\\t|\n" +
                    " \t\t|\t3.Edit employee\tFacility Management\t\t\t|\n" +
                    " \t\t|\t4.Return main menu \t\t\t|");
            System.out.println("\n\t\t|---------------------------------------|");
            System.out.println("Nhập lựa chọn :");
            switch (scanner.nextInt()) {
                case 1: {
                    employeeService.display();
                    break;
                }
                case 2: {
                    employeeService.addNew();
                    break;
                }
                case 3: {
                    employeeService.update();
                    break;
                }
                case 4: {
                    check = false;
                    break;
                }
            }
        }
    }
    public static void displayCustomerMenu() {
        boolean check = true;
        while (check) {
            System.out.println("\tCustomer menu");
            System.out.println("1.Display list employees\t\t\t\t|\n" +
                    " \t\t|\t2.Add new employee\t\\t\\t|\n" +
                    " \t\t|\t3.Edit employee\tFacility Management\t\t\t|\n" +
                    " \t\t|\t4.Return main menu \t\t\t|");
            System.out.println("\n\t\t|---------------------------------------|");
            System.out.println("Nhập lựa chọn :");
            switch (scanner.nextInt()) {
                case 1: {
                    break;
                }
                case 2: {
                    break;
                }
                case 3: {
                    break;
                }
                case 4: {
                    check = false;
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        displayMainMenu();
    }
}

