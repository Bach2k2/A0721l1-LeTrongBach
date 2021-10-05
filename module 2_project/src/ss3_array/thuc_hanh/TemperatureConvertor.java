package ss3_array.thuc_hanh;

import java.util.Scanner;

public class TemperatureConvertor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. F to Celcius");
        System.out.println("2. Celcius to F");
        System.out.println("3.Exit");
        int choice;
        double C, F;
        do {
            System.out.println("\nEnter your choice: ");
            choice = input.nextInt();
            if (choice == 1) {
                System.out.print("Nhiệt độ F cần đổi: ");
                F = input.nextDouble();
                System.out.printf("Nhiệt độ C: %.3f", fToC(F));
            } else if (choice == 2) {
                System.out.println("Nhiệt độ C cần đổi:");
                C = input.nextDouble()  ;
                System.out.printf("Nhiệt đọ F: %.3f", cToF(C));
            } else if (choice == 3) {
                break;
            } else {
                System.out.println("Bạn hãy nhập lại ^^");
            }
        } while (choice > 0 && choice < 4);
    }


    public static double fToC(double F) {
        double C = (F - 32) * 5.0 / 9;
        return C;
    }

    public static double cToF(double C) {
        double F = (9.0 / 5) * C + 32;
        return F;
    }
}
