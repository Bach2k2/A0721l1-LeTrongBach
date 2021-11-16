package ss17_serialization_and_binaryfile.bai_tap;

import java.io.*;
import java.util.Scanner;

public class CopyBinaryFile {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập đường dẫn của input: ");
        String path=scanner.nextLine();
        int i=-1;
        byte[] Bytes=new byte[10];
        int count=0;
        try {
            InputStream is=new FileInputStream(path);
            while((i= is.read(Bytes))!=-1)
            {
                String line =new String(Bytes,0,i);
                System.out.print(line);
                count++;
            }
            System.out.println("Số byte: "+count);
            System.out.println("\nNhập đường dẫn output: ");
            String outputPath= scanner.nextLine();
            OutputStream os=new FileOutputStream(outputPath);
            for(int j=0;j<Bytes.length;j++)
            {
                byte b=Bytes[j];
                os.write(b);
            }
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
            System.out.println("File input không tồn tại");
        }
        catch (IOException e)
        {
            System.out.println("Lỗi");
            e.printStackTrace();
        }
    }
}
