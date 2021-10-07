package ss3_array.bai_tap;

import java.util.Scanner;

public class MinOfArr {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Nhập độ dài mảng: ");
        int size= input.nextInt();
        int[] array =new int[size];
        for(int i=0;i< array.length;i++)
        {
            System.out.printf("Enter the element in %d position: ",i+1);
            array[i]= input.nextInt();
        }
        System.out.println("In các phần tử trong mảng : ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.print("\nGiá trị nhỏ nhất: "+ findMinValue(array));
    }
    public static int findMinValue(int [] arr)
    {
        int min=arr[0];
        for (int i=1;i< arr.length;i++)
        {
            if (min > arr[i]) min = arr[i];
        }
        return min;
    }
}
