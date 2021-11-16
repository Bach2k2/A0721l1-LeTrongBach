package ss19_string_and_regex.thuc_hanh;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmail {
    public static String EmailForm="^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        char choice;
        do {
            System.out.println("Nhập mail của bạn: ");
            String mail= scanner.nextLine();
            Pattern myPattern;
            Matcher myMatcher;
            myPattern=Pattern.compile(EmailForm);
            myMatcher=myPattern.matcher(mail);
            if(myMatcher.matches()) System.out.println("Hợp lệ");
            else {
                System.out.println("KO hợp lệ");
            }
            System.out.println("Bạn có muốn thoát ko?Nhấn q để thoát");
            choice=scanner.nextLine().charAt(0);
        }while(choice!='q'&&choice!='Q');
    }
}
