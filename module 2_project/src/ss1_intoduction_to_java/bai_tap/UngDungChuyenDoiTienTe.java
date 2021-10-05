package ss1_intoduction_to_java.bai_tap;
import java.util.Scanner;

public class UngDungChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double vnd=23000;
        System.out.println("\nỨng dụng chuyển đổi từ USD sang tiền VNĐ");
        System.out.println("\nNhập tiền USD: ");
        double usd=scanner.nextDouble();
        System.out.println("Tiền VNĐ: "+ (vnd*=usd) +" VNĐ");
    }
}
