package ss15_exception.thuc_hanh;

import java.util.Scanner;

public class CalculateExample {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập x: ");
        int x=scanner.nextInt();
        System.out.println("Nhập y: ");
        int y= scanner.nextInt();
        CalculateExample calc=new CalculateExample();
        calc.calculate(x,y);
    }
    public void calculate(int x,int y)
    {
        try{
            int a=x+y;
            int b=x-y;
            int c=x*y;
            int d=x/y;
            System.out.println("Tổng: " +a);
            System.out.println("Hiệu: " +b);
            System.out.println("Tích: " +c);
            System.out.println("Thương: " +d);
        }catch (Exception e)
        {
            System.err.println("Xảy ra ngoại lệ: "+e.getMessage());
        }
    }
}
