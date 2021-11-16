package java.system;
import java.io.*;
public class files {
        public static void main(String args[]) {
            File obj = new File("src\\java\\system");
            System.out.print(obj.getParent());
            System.out.print(" " + obj.isFile());
    }
}
