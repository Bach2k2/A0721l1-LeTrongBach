package ss15_exception.thuc_hanh;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] createRandom()
    {
        Integer []arr=new Integer[100];
        for(int i=0;i<100;i++)
        {
            arr[i]=(int)(Math.random()*100);
        }
        return arr;
    }
    public static void main(String[] args) {
        ArrayExample arrayExample=new ArrayExample();
        Integer[] arr=arrayExample.createRandom();
        for(int i=0;i<100;i++) System.out.println(arr[i]+"\t");
        Scanner scanner=new Scanner(System.in);
        int x;
        do {
            System.out.println("Vui lòng nhập 1 phần tử bât kì: ");
            x= scanner.nextInt();
            try{
                System.out.println("Phần tử tại vị trí " + x + " là: " + arr[x]);
            }
            catch (IndexOutOfBoundsException e)
            {
                System.out.println("Phần tử có chỉ số vượt giới hạn ");
                e.printStackTrace();
            }
            catch(InputMismatchException e)
            {
                System.out.println("Nhập kí tự số plssss");
            }
        }while(x!=1);

    }
}

