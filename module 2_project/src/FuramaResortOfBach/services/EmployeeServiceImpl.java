package FuramaResortOfBach.services;

import FuramaResortOfBach.models.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    public static List<Employee> employeeList = new ArrayList<>();
    public static int employeeAmount=0;
    private static Scanner scanner = new Scanner(System.in);

    public boolean searchObj(String name) {
        boolean isExist = false;
        for (Employee employee : employeeList) {
            if (name.equals(employee.getName())) isExist = true;
        }
        return isExist;
    }


    public void deleteObj(String name) {

    }


    public int indexObj(String name) {
        int index = -1;
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getName().equals(name)) index = i;
        }
        return index;
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
        System.out.println("Nhập trình độ:");
        String level = scanner.nextLine();
        System.out.println("Nhập vị trí:");
        String position = scanner.nextLine();
        System.out.println("Nhập lương:");
        double salary = scanner.nextDouble();
        Employee employee=new Employee(name,dateOfBirth,gender,personId,email,phoneNum,level,position,salary);
        employeeList.add(employee);
        employeeAmount++;
    }

    @Override
    public void update() {
        System.out.println("Nhập id cần update: ");
        int personId = Integer.parseInt(scanner.nextLine());
        Employee updateOne=new Employee();
        for (Employee employee:employeeList) {
            if (employee.getPersonId()==personId) {
                updateOne = employee;
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
                do {
                    System.out.println("Edit email!\n New email:");
                    newEmail = scanner.nextLine();
                    if (newEmail.equals("")) System.out.println("Nhập lại nhé:");
                } while (newEmail.equals(""));
                updateOne.setEmail(newEmail);

                String newPhoneNum;
                do {
                    System.out.println("Edit phone number!\n New phone number:");
                    newPhoneNum = scanner.nextLine();
                    if (newPhoneNum == "") System.out.println("Nhập lại nhé:");
                } while (newPhoneNum == "");
                updateOne.setPhoneNum(newPhoneNum);


                String level;
                do {
                    System.out.println("Edit \n New level:");
                    level = scanner.nextLine();
                    if (level.equals("")) System.out.println("Nhập lại nhé:");
                } while (level.equals(""));
                updateOne.setLevel(level);

                String newPos;
                do {
                    System.out.println("Edit Name!\n New name:");
                    newPos = scanner.nextLine();
                    if (newPos == "") System.out.println("Nhập lại nhé:");
                } while (newPos == "");
    }

    @Override
    public void display() {
        for (Employee employee : employeeList) {
            System.out.println(employee.toString());
        }
    }

    @Override
    public void delete() {
        System.out.println("Nhập tên cần xóa");
        String name=scanner.nextLine();
        for (Employee employee : employeeList) {
            if (employee.getName().equals(name)) {
                employeeList.remove(employee);
                break;
            }
        }
    }
}
