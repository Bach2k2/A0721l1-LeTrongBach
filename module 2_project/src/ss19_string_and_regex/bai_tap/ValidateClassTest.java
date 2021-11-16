package ss19_string_and_regex.bai_tap;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClassTest {
    private final static String Class_Regex = "[CPM][0-9]{3}[GHIkLM]$";

    static boolean IsValid(String name) {
        Pattern pattern = Pattern.compile(Class_Regex);
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String[] classNames = {"C0318G", "M0318G", "P0323A"};
        for (String name : classNames) {
            if (IsValid(name))
            {
                System.out.println("Name " + classNames + " is valid");
            }
            else {
                System.out.println("Name " + classNames + " is invalid");
            }
        }
    }
}
