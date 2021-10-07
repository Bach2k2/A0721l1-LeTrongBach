package ss3_array.bai_tap;

import java.util.Scanner;

public class ChenThemPhanTuVaoMang {
    public static void main(String[] args) {
        System.out.println("Thêm 1 phần tử bất kì vào mảng");
        Scanner input =new Scanner(System.in);
        System.out.println("Nhập độ dài của mảng: ");
        int length=input.nextInt();
        int [] array=new int[length];
        inputArr(array);
        System.out.print("Mảng vừa nhâp: ");
        printArr(array);
        System.out.print("\nNhập giá trị phần tử cần thêm: ");
        int addOne=input.nextInt();
        int pos;
        do {
            System.out.print("Nhập vị trí cần thêm: ");
            pos=input.nextInt();
            if (pos<=1|| pos>=array.length-1)
            {
                System.out.println("Vị trí không phù hợp");
            }
        }while(pos<=1|| pos>=array.length-1);
        System.out.println("Mảng sau khi thêm: ");
        printArr(addEle(array,pos,addOne));
    }
    public static void inputArr(int [] array)
    {
        Scanner input =new Scanner(System.in);
        for(int i=0;i<array.length;i++)
        {
            System.out.printf("Enter the element in %d position: ",i+1);
            array[i]=input.nextInt();
        }
    }
    public static void printArr(int [] array)
    {
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i] + " ");
        }
    }
    public static int[] addEle(int [] array, int pos, int addOne)
    {
        int [] newArr= new int[array.length+1];
        for (int i=0;i<array.length;i++)
        {
           newArr[i]=array[i];
        }
        for (int i=array.length;i>pos;i--)
        {
            newArr[i]=newArr[i-1];
        }
        newArr[pos]=addOne;
        return newArr;
    }
}