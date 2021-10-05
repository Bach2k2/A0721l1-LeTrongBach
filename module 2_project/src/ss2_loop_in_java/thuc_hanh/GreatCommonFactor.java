package ss2_loop_in_java.thuc_hanh;

import java.util.Scanner;

public class GreatCommonFactor {
    public static void main(String[] args) {
        System.out.println("Tìm ước chung lớn nhất của 2 số");
        Scanner scanner =new Scanner(System.in);
        System.out.println("Số thứ nhất:");
        int num1= scanner.nextInt();
        System.out.println("Số thứ hai:");
        int num2=scanner.nextInt();
        int number1=num1=Math.abs(num1);
        int number2=num2=Math.abs(num2);
        while(num1!=num2)
        {
            if (num1>num2)
            {
                num1=num1-num2;
            }
            else
            {
                num2=num2-num1;
            }
        }
        System.out.printf("ƯCLN(%d,%d)=%d: ",number1,number2,num1);
    }
}
