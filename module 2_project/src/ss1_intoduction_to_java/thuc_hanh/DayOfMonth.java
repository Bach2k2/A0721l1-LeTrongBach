package ss1_intoduction_to_java.thuc_hanh;

import java.util.Scanner;

public class DayOfMonth {
    public static void main(String[] args) {
        System.out.println("\nChương trình đếm số ngày trong tháng!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nThang can tim: ");
        int month = scanner.nextInt();
        String daysOfMonth;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysOfMonth = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysOfMonth = "30";
                break;
            case 2:
                daysOfMonth = "28 hoac 29";
                break;
            default:
                daysOfMonth = "";
        }
        if (!daysOfMonth.equals("")) {
            System.out.printf("Thang '%d' co %s ngay", month, daysOfMonth);
        } else {
            System.out.println("Khong co thang nay");
        }
    }
}
