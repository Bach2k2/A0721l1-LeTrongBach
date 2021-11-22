package FURAMA_RESORT_PROJECT.services;

import FURAMA_RESORT_PROJECT.models.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    public static List<Employee> employeeList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public void updateObj(String name, int choice) {

        Employee updateOne;
        for (Employee employee : employeeList) {
            if (employee.getName().equals(name)) {
                updateOne = employee;
                break;
            }
        }
        switch (choice) {
            case 1: {
                String newName;
                do {
                    System.out.println("Edit Name!\n New name:");
                    newName = scanner.nextLine();
                    if (newName == "") System.out.println("Nhập lại nhé:");
                } while (newName == "");
                break;

            }
            case 2: {
                String newEmail;
                do {
                    System.out.println("Edit Name!\n New name:");
                    newEmail = scanner.nextLine();
                    if (newEmail == "") System.out.println("Nhập lại nhé:");
                } while (newEmail == "");
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
                String newLevel;
                do {
                    System.out.println("Edit Level!\n New level:");
                    newLevel = scanner.nextLine();
                    if (newLevel == "") System.out.println("Nhập lại nhé:");
                } while (newLevel == "");
                break;
            }
            case 5: {
                String newPos;
                do {
                    System.out.println("Edit Name!\n New name:");
                    newPos = scanner.nextLine();
                    if (newPos == "") System.out.println("Nhập lại nhé:");
                } while (newPos == "");
                break;
            }
            case 6: {
                double newSalary;
                System.out.println("Edit Salary!\n New salary:");
                newSalary = scanner.nextDouble();
                break;
            }
            default: {
                System.out.println("Sai lua chon");
                break;
            }
        }


    }


    public boolean searchObj(String name) {
        boolean isExist = false;
        for (Employee employee : employeeList) {
            if (name.equals(employee.getName())) isExist = true;
        }
        return isExist;
    }


    public void deleteObj(String name) {
        for (Employee employee : employeeList) {
            if (employee.getName().equals(name)) {
                employeeList.remove(employee);
                break;
            }
        }
    }


    public int indexObj(String name) {
        int index = -1;
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getName().equals(name)) index = i;
        }
        return index;
    }

    @Override
    public void displayList() {
        for (Employee employee : employeeList) {
            System.out.println(employee.toString());
        }
    }


}
