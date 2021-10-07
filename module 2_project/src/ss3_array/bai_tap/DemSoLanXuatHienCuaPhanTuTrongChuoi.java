package ss3_array.bai_tap;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DemSoLanXuatHienCuaPhanTuTrongChuoi {
    public static void main(String[] args) throws IOException {
        System.out.println("Đếm kí tự xuất hiện trong chuỗi");
        String str = "";
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Nhập một chuỗi bất kì:");
        try {
            str = input.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("\nNhập kí tự cần đếm: ");
        char character = (char) input.read();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (character == str.charAt(i)) count++;
        }
        System.out.printf("Kí tự %c xuất hiện %d lần", character, count);
    }
}

