package ss13_thuat_toan_sap_xep.bai_tap;

import java.util.Scanner;

public class BinarySearch {
    // Sử dụng đệ quy trong thuật toán tìm kiếm nhị phân
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Nhập số lượng phẩn tử mảng: ");
        int amount = input.nextInt();
        int [] array = new int[amount];
        int i=0;
        for(;i<array.length;i++)
        {
            System.out.printf("\n Nhập phẩn tử thứ %d :",i+1);
            array[i]= input.nextInt();
        }
        Sort(array);
        System.out.println("sau khi sort: ");
        for (int number:array) {
            System.out.print("\t"+number);
        }
        System.out.println("\nNhập value cần tìm kiếm: ");
        int value= input.nextInt();
        System.out.println("\nIndex of value vừa nhập:: "+ BinarySearch(array,0,array.length-1,value));

    }
    public static void Sort(int[] arr)
    {
        for(int i=0;i< arr.length-1;i++)
        {
            for (int j= arr.length-1;j>i;j--)
            {
                if(arr[j]<arr[j-1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }
    public static int BinarySearch(int [] arr, int left,int right,int value)
    {
        int middle =(left +right)/2;
        if(left>right) return -1;
        else {
            if (arr[middle] == value) return middle;
            else if (arr[middle] > value) {
              return  BinarySearch(arr, middle + 1, right, value);
            } else {
               return BinarySearch(arr, left, middle - 1, value);
            }
        }
    }
}
