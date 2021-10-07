package ss3_array.bai_tap;

import java.util.Scanner;

public class MaxOfTwoDimArr {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Nhập số hàng: ");
        int row=input.nextInt();
        System.out.print("Nhập số cột: ");
        int col= input.nextInt();
        int[][] arr =new int[row][col];
        inputMat(arr,row,col);
        System.out.println("Ma trận vừa nhập: ");
        printMat(arr,row,col);
        System.out.println("------ Phần tử lớn nhất trong mảng: "+ maxOfMatrix(arr,row,col));
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
                System.out.print(arr[i][j]+" ");

            }
            System.out.print("\n");
        }
    }
    public static int maxOfMatrix(int [][] arr,int row,int col)
    {
        int max= arr[0][0];
        for(int i=0;i<row;i++)
        {
            for (int j=0;j<col;j++)
            {
                if(max < arr[i][j]) max=arr[i][j];
            }

        }
        return max;
    }
}
