package ss3_array.bai_tap;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        //    System.out.println("Nhập mảng thứ nhất");
        Scanner input=new Scanner(System.in);
        System.out.print("Nhập length 1: ");
        int len1=input.nextInt();
        int [] arrA =new int[len1];
        System.out.println("Nhập mảng A: ");
        inputArr(arrA);
        System.out.print("Nhập length 2: ");
        int len2= input.nextInt();
        int [] arrB=new int[len2];
        System.out.println("Nhập mảng B: ");
        inputArr(arrB);
        System.out.print("Mảng A:");
        printArr(arrA);
        System.out.print("\nMảng B:");
        printArr(arrB);
        int []arrC;
        arrC = includedArr(arrA, arrB);
        System.out.print("\nMảng kết hợp 2 mảng A, B: ");
        printArr(arrC);
    }
    public static void inputArr(int[] arr)
    {
        Scanner input=new Scanner(System.in);
        for (int i=0; i<arr.length;i++)
        {
            System.out.printf("Nhập phần tử Mảng thứ %d:", i+1);
            arr[i]=input.nextInt();
        }
    }

    public static int[]includedArr(int[] arrA, int[] arrB) {
        int[] arrC = new int[arrA.length + arrB.length];
        int i=0;
        while (i<arrC.length) {
            for (int j = 0; j < arrA.length; j++) {
                arrC[i] = arrA[j];
                i++;
            }
            for (int j = 0; j < arrB.length; j++) {
                arrC[i] = arrB[j];
                i++;
            }
        }
        return arrC;
    }
    public static void printArr(int[] arr)
    {
        for (int i=0; i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
