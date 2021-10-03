package ss1_intoduction_to_java.thuc_hanh;
import java.util.Scanner;
public class LeapYearCalculator {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("\nWhich year will you choose: ");
        int year= scanner.nextInt();
        if(year % 4 == 0)
        {
            if (year % 100 != 0)
            {
                System.out.printf("\n%d is leap year",year);
            }
            else
            {
                if(year %400 == 0) System.out.printf("\n%d is leap year",year);
                else System.out.printf("\n%d is not leap year",year);
            }
        }
        else {
            System.out.printf("\n%d is not leap year",year);
        }
    }
}
