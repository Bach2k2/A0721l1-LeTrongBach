package ss10_list.bai_tap;

import java.util.Scanner;

public class MyLinkedListTest {
    public static void main(String[] args) {
      //  Scanner scanner = new Scanner(System.in);
        MyLinkedList<StudentSS10> studentList = new MyLinkedList<>();
        StudentSS10 std1=new StudentSS10("Bach","20");
        studentList.addFirst(std1);
        StudentSS10 std2=new StudentSS10("Bach2","202");
        studentList.addFirst(std2);
        StudentSS10 std3= studentList.get(0);
        StudentSS10 std4= studentList.get(1);
        System.out.println(std3.getName());
        System.out.println(std4.getName());
        printList(studentList);
        menu(studentList);
    }

    public static void menu(MyLinkedList list) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------------------Menu------------------------");
        System.out.println("1.Thêm sinh viên ");
        System.out.println("2.Xóa sinh viên");
        System.out.println("3.In danh sách");
        System.out.println("0.Thoát");
        int choice;
        do {
            System.out.print("Nhập lựa chọn: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            if (choice == 1) {
                System.out.println("Tên sinh viên:");
                String name = scanner.nextLine();
                System.out.println("Lớp:");
                String classes = scanner.nextLine();
                StudentSS10 addStudentSS10 = new StudentSS10(name, classes);
                list.addFirst(addStudentSS10);
            } else if (choice == 2) {
                System.out.println("Nhập vị trí cần xóa");
                int index = scanner.nextInt();
                list.remove(index);
            } else if (choice == 3) {
                System.out.println("In danh sách sinh viên: ");
                printList(list);
            } else if (choice == 0) {
                break;
            } else {
                System.out.println("Lựa chọn ko đúng, mời nhập lại");
            }
        } while (true);
    }

    public static void printList(MyLinkedList<StudentSS10> list) {
        for (int i = 0; i <list.numNodes; i++) {
            StudentSS10 studentSS10 = new StudentSS10();
            studentSS10 = list.get(i);
            System.out.println("Sinh viên " + (i+1) +
                    " có tên: "+ studentSS10.getName() +
                    ", lớp: " + studentSS10.getClasses());
        }
    }
}
