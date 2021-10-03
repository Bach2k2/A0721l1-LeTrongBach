package ss1_intoduction_to_java.thuc_hanh;
import java.util.Scanner;
public class OperatorExpression {
    public static void main(String[] args) {
        float width ;
        float height;
        float area;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều dài: ");
        width=scanner.nextFloat(); // Nhập chiều dài;

        System.out.println("Nhập chiều rộng: ");
        height=scanner.nextFloat(); // Nhập chiều rộng;
        area=width*height;
        System.out.println("Area is:" + area);
    }
}
