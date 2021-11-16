package ss19_string_and_regex.bai_tap;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneValidate {
    private final static String Phone_Regex = "\\(([0-9]{2})\\)\\-\\(([0][0-9]{9})\\)$";

    static boolean IsValid(String name) {
        Pattern pattern = Pattern.compile(Phone_Regex);
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String[] phoneNames ={"(84)-(0978489648)","(a8)-(22222222)" };
        for (String name : phoneNames ) {
            if (IsValid(name))
            {
                System.out.println("Name " + name + " is valid");
            }
            else {
                System.out.println("Name " +  name + " is invalid");
            }
        }
    }
}
