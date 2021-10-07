package ss3_array.bai_tap;

import java.util.Scanner;

public class DemSoSinhVienThiDo {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int size;
        int[] array;
        do {
            System.out.print("Nhập độ dài mảng: ");
            size = scanner.nextInt();
            if (size > 30)
                System.out.println("Độ dài không quá 30");
        } while (size > 30);
        array = new int[size];
       for(int i=0;i<array.length;i++) {
            do {
                System.out.print("Nhập điểm của sinh viên thứ " + (i + 1) + ": ");
                array[i] = scanner.nextInt();
                if(array[i]<0||array[i]>10) System.out.println ("Thang điểm 10! . Mời nhập lại");
            }while (array[i]<0||array[i]>10);
        }
        int count = 0;
        System.out.print("Điểm của các sinh viên vừa nhập: ");
        for (int k : array) {
            System.out.print(k + "\t");
            if (k >= 5 && k <= 10)
                count++;
        }
        System.out.print("\n Số Sinh viên thi đỗ: " + count);
    }
}
