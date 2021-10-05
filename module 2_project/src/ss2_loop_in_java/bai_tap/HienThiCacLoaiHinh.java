package ss2_loop_in_java.bai_tap;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        System.out.println("\nMenu:");
        System.out.println("\n1. Print the rectangle");
        System.out.println("\n2.Print the square triangle");
        System.out.println("\n3.Print isosceles triangle");
        System.out.println("\n4.Exit");
        Scanner scanner = new Scanner(System.in);
        int choose;
        //In hình chữ nhật
        do {
            System.out.println("\nYour choose is: ");
            choose = scanner.nextInt();
            if (choose == 1) {
                System.out.println("\nIn hình chữ nhật");
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 7; j++) {
                        System.out.print("* ");
                    }
                    System.out.print("\n");
                }
            } else if (choose == 2) {
                System.out.println("\nIn hình tam giác vuông, có cạnh góc vuông ở botton-left");
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 5; j++) {
                        if (i > j) System.out.print("* ");
                    }
                    System.out.print("\n");
                }

                System.out.println("\nIn hình tam giác vuông, có cạnh góc vuông ở top-left");
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 5; j++) {
                        if (j > i) System.out.print("* ");
                    }
                    System.out.print("\n");
                }
            } else if (choose == 3) {
                System.out.println("\nIn hình tam giác cân");
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j <9; j++) {
                        if (j>=4-i && j<=4+i) System.out.print("*");
                        else System.out.print(" ");
                    }
                    System.out.print("\n");
                }
            } else if (choose == 4) {
                break;
            } else System.out.println("Mời bạn nhập lại");
        } while (choose!=4);
    }
}
