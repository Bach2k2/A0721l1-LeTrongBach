package ss16_io_test_file.bai_tap;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFileTest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        BufferedReader buffer=null;
        try {
            File inputFile;
            inputFile = new File("D:\\A0721l1-LeTrongBach\\module 2_project\\src\\ss16_io_test_file\\bai_tap\\.csv");
            if (!inputFile.exists()) {
                throw new FileNotFoundException();
            }
            buffer = new BufferedReader(new FileReader(inputFile));

            String line;
            while((line =buffer.readLine())!=null)
            {
               print(parseCsvLine(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try{
                if(buffer!=null) buffer.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }

    }
    public static List<String> parseCsvLine (String csvLine)
    {
        List<String> result=new ArrayList<>();
        if(csvLine!=null)
        {
            String[] splitData =csvLine.split(",");
            for(int i=0;i<splitData.length;i++)
            {
                result.add(splitData[i]);
            }
        }
        return result;
    }
    public static void print(List<String> country)
    {
        System.out.println("Country [id= " + country.get(0)+
                ",code: "+country.get(1)+
                ",name: "+country.get(2)+" ]");
    }
}
