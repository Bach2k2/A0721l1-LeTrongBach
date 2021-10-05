package ss2_loop_in_java.thuc_hanh;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        System.out.println("Kiểm tra số nguyên tố");
        Scanner input = new Scanner(System.in);
        int stop;
        do {
            int check = 1;
            System.out.println("Mời nhập một số nguyên: ");
            int number = input.nextInt();
            if (number == 0 || number == 1) check = 0;
            else {
                for (int i = 2; i <= Math.sqrt(number); i++) {
                    if (number % i == 0) {
                        check = 0;
                        break;
                    }
                }
            }
            if (check == 0) System.out.printf("%d is not prime number", number);
            else System.out.printf("%d is a prime number", number);

            System.out.println("\nCó muốn tiếp tục ko? Nhấn 0 để thoát");
            System.out.print("Your choice:");
            stop = input.nextInt();
        } while (stop != 0);
    }
}

