package ss3_array.bai_tap;

import java.util.Scanner;

public class XoaPhanTutrongMang {
    public static void main(String[] args) {
        System.out.println("Xoa Phần tử trong mảng");
        Scanner input = new Scanner(System.in);
        int length;
        do {
            System.out.print("Nhập độ dài mảng: ");
            length = input.nextInt();
            if (length > 20 || length < 0) System.out.println("\nBạn hãy nhập lại");
        } while (length < 0 || length > 20);
        int[] array =new int[length];
        for(int i=0;i< array.length;i++)
        {
            System.out.printf("Enter the element in %d position: ",i+1);
            array[i]= input.nextInt();
        }
        System.out.print("Mảng sau khi nhập: ");
        printArray(array);
        int delOne;
        System.out.print("\nEnter delete element: ");
        delOne=input.nextInt();
        deleteEle(array,delOne);
        System.out.print("Mảng sau khi xóa đi các phần tử: ");
        printArray(array);
       // System.out.println(Arrays.toString(array));
    }
    public static void printArray(int[] array)
    {

        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+ " ");
        }
    }

    private static void deleteEle(int[] array, int delOne)
    {
        int index=-1;
        for(int i=0;i<array.length;i++)
        {
            if(array[i]==delOne) {
                index = i;
                for(int j=index;j<array.length-1;j++)
                {
                    array[j]=array[j+1];
                }
                array[array.length-1]=0;
                i--;
            }
        }
        if(index<0) System.out.println("Không tìm thấy phần tử nào");
    }
}
