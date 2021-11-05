package ss16_io_test_file.bai_tap;

import java.io.*;
import java.util.Scanner;

public class IOFile {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        // Trong bài tập này: Đường dẫn của file input là đường dẫn file Hello.txt
        System.out.println("Nhập đường dẫn: ");
        String path= input.nextLine();
        try{
            File inputFile=new File(path);
            if(!inputFile.exists())
            {
                throw new FileNotFoundException();
            }
            BufferedReader buffer=new BufferedReader(new FileReader(inputFile));
            //File đọc để copy:
            FileWriter outputFile =new FileWriter("D:\\A0721l1-LeTrongBach\\module 2_project\\src\\ss16_io_test_file\\bai_tap\\myFile.txt");

            String line="";
            while((line = buffer.readLine())!= null)
            {
                outputFile.write(line);
            }

            outputFile.close();
        }
        catch (IOException e)
        {
            System.out.println("File output đã có hoặc tên file ko tồm tại! ");
            e.printStackTrace();
        }
    }
}
