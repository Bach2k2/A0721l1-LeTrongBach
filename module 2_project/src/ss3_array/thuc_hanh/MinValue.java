package ss3_array.thuc_hanh;

import java.util.Scanner;

public class MinValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập độ dài của mảng: ");
        int length = input.nextInt();
        double[] array;
        array = new double[length];
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Nhập phân tử thứ %d :", i + 1);
            array[i] = input.nextDouble();
        }
        int index= minValue(array);
        System.out.println("Min of array: " + array[index]);
    }

    public static int minValue(double[] array) {
        int index=0;
        for (int i = 1; i < array.length; i++) {
            if (array[index] > array[i]) index=i;
        }
        return index;
    }
}
