package ss3_array.bai_tap;

import java.util.Scanner;

public class TongDuongCheoChinhCuaMT {
    public static void main(String[] args) {
        System.out.println("Tổng các đường chéo chính: ");
        Scanner scanf =new Scanner(System.in);
        System.out.println("Nhập số hàng");
        int row=scanf.nextInt();
        System.out.println("Nhập số cột");
        int col=scanf.nextInt();
        int [][] matrix=new int[row][col];
        for(int i=0;i<row;i++)
        {
            for (int j=0;j<col;j++)
            {
                System.out.printf("Nhâp giá trị tại (%d, %d): ",i,j);
                matrix[i][j]= scanf.nextInt();
            }
        }
        for(int i=0;i<row;i++)
        {
            for (int j=0;j<col;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.print("\n");
        }
        System.out.print("Tổng đường chéo chính: "+  sumOfMatrix(matrix,row));
    }
    public static int sumOfMatrix(int [][] arr,int row)
    {
        int sum=0;
        for (int i=0;i<row;i++)
        {
           sum+=arr[i][i];
        }
        return sum;
    }
}
