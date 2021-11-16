package ss19_string_and_regex.thuc_hanh;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class AccountExample {
    private String Account_Regex = "^[0-9a-zA-Z_]{6,}$";

    public boolean Validate(String str) {
        Pattern myPattern = Pattern.compile(Account_Regex);
        Matcher myMatcher = myPattern.matcher(str);
        return myMatcher.matches();
    }
}
class AccountExampleTest{
   private static AccountExample accountExample;
   private static final String[] validAccount={ "123abc_","_abc123","_______","123456","abcdfgE"};
    private static final String[] invalidAccount={ ".@","12345","123","abcde"};


    public static void main(String[] args) {
        accountExample=new AccountExample();
        System.out.println("Nhập tài khoản: ");
        Scanner scanner=new Scanner(System.in);
        for (String account: validAccount)
        {
            System.out.println("The "+ account +" is validate: "+accountExample.Validate(account));
        }
        System.out.println("\n----------------------------");
        for (String account: invalidAccount)
        {
            System.out.println("The "+ account +" is validate: "+accountExample.Validate(account));
        }
    }
}
