package ss2_loop_in_java.thuc_hanh;

import java.util.Scanner;

public class TinhLaiSuatHangNam {
    public static void main(String[] args) {
        System.out.print("\n Ứng dụng tính tiền lãi cho vay");
        Scanner scanner=new Scanner(System.in);
        double money;
        System.out.print("\nNhập lãi suất hàng năm (%): ");
        double interestRate= scanner.nextDouble();
        System.out.print("\nNhập tiền cho vay:");
        money= scanner.nextDouble();
        System.out.print("\nNhập số tháng cho vay:");
        int month= scanner.nextInt();
        double totalInterest=0;
        for (int i=0;i<month;i++)
        {
            totalInterest+=money*(interestRate/100)/12+month;
        }
        System.out.print("\nTổng tiền lãi: " + totalInterest);
    }
}
