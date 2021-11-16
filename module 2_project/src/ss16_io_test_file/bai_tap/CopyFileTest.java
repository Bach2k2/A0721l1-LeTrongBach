package ss16_io_test_file.bai_tap;

import java.io.*;
import java.util.Scanner;

public class CopyFileTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Trong bài tập này: Đường dẫn của file input là đường dẫn file Hello.txt
        System.out.println("Nhập đường dẫn: ");
        String path = input.nextLine();
        try {
            File inputFile = new File(path);
            if (!inputFile.exists()) {

                throw new FileNotFoundException();
            }
            BufferedReader buffer = new BufferedReader(new FileReader(inputFile));
            //File đọc để copy:
            FileWriter outputFile = new FileWriter("src\\ss16_io_test_file\\bai_tap\\myCopyFile.txt");

            String line = "";
            while ((line = buffer.readLine()) != null) {
                outputFile.write(line + "\n");
            }
            outputFile.write("Number of characters: " + countNumberOfCharacter(path));
            outputFile.close();
        } catch (IOException e) {
            System.out.println("File output đã có hoặc tên file ko tồn tại! ");
            e.printStackTrace();
        }
    }

    public static int countNumberOfCharacter(String path) throws IOException {
        File file = new File(path);
        if (!file.exists()) {
            throw new IOException();
        } else {
            BufferedReader readMem = new BufferedReader(new FileReader(file));
            String str = "";
            String line;
            while ((line = readMem.readLine()) != null) {
                str += line;
            }
            String result=str.replace(" ","");
            System.out.println(result);
            int countChar = str.length();
            return countChar;
        }
    }
}
