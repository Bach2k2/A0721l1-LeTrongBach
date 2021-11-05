package ss15_exception.bai_tap;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        double a, b, c;
        System.out.println("Kiểm tra tam giác");
        System.out.println("Độ dài 3 cạnh của 1 tam giác là a,b,c ");
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập a:");
        a = input.nextDouble();
        System.out.println("Nhập b:");
        b = input.nextDouble();
        System.out.println("Nhập c:");
        c = input.nextDouble();
        try
        {
            checkTriangle(a,b,c);
        }
        catch (IllegalTriangleException e)
        {
            System.err.println(e.getMessage());
        }
    }
    public static void  checkTriangle( double a,double b,double c) throws IllegalTriangleException
    {
        if(a<=0||b<=0||c<=0) {
            throw (new IllegalTriangleException("Độ dài của tam giác phai lớn hơn 0"));
        }
        else if (a+b<c||b+c<a||a+c<b)
        {
            throw new IllegalTriangleException("Không phải là 1 tam giác!");
        }
        else {
            System.out.println("Legal triangle");
        }
    }
}
