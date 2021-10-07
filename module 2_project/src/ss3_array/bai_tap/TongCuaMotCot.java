package ss3_array.bai_tap;

import java.util.Scanner;

public class TongCuaMotCot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số hàng: ");
        int row = input.nextInt();
        System.out.print("Nhập số cột: ");
        int col = input.nextInt();
        int[][] arr = new int[row][col];
        inputMat(arr, row, col);
        System.out.println("Ma trận vừa nhập: ");
        printMat(arr, row, col);
        System.out.println("Chọn cột để tính tổng: ");
        int whichCol= input.nextInt();
        System.out.println("Tổng của cột: " + sumOfCol(arr,row,whichCol));
    }
    public static void inputMat(int [][] arr,int row, int col)
    {
        Scanner input=new Scanner(System.in);
        for(int i=0;i<row;i++)
        {
            for (int j=0;j<col;j++)
            {
                System.out.printf("Nhập phần tử (%d, %d): ",i,j);
                arr[i][j]=input.nextInt();
            }
        }
    }
    public static void printMat(int [][] arr,int row, int col)
    {
        for(int i=0;i<row;i++)
        {
            for (int j=0;j<col;j++)
            {
                System.out.print(arr[i][j]+" \t");

            }
            System.out.print("\n");
        }
    }
    public static int sumOfCol(int [][]arr,int row,int whichCol)
    {
        int sum=0;
        for (int i=0;i<row;i++)
        {
            sum+=arr[i][whichCol];
        }
        return sum;
    }
}
