package ss1_intoduction_to_java.thuc_hanh;
import java.util.Scanner;
public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("\nChào mừng đến với chương trình xử lý pt bậc nhất");
        System.out.println("\nPhương trình có dạng a*x+b=c. Mời bạn nhập các hệ số");
        Scanner scanner=new Scanner(System.in);
        System.out.println("\n Nhập hệ số a:");
        float a= scanner.nextFloat();
        System.out.println("\n Nhập hệ số b:");
        float b=scanner.nextFloat();
        System.out.println("\n Nhập hệ số c:");
        float c=scanner.nextFloat();
        if (a == 0)
        {
            if (b==c)
            {
                System.out.println("\nPhuong trinh vo so nghiem");
            }
            else {
                System.out.println("\nPhuong trinh vo nghiem");
            }
        }
        else{
            float x=(c-b)/a;
            System.out.printf("\nPhuong trinh co nghiem: x= %s%n", x);
        }
    }
}
