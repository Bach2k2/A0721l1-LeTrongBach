package ss16_io_test_file.thuc_hanh;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaxNumber {
    public List<Integer> readFile(String filePath){
        List<Integer> numbers = new ArrayList<>();
        try {
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                numbers.add(Integer.parseInt(line));
            }
            br.close();
        } catch (Exception e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
        return numbers;
    }
    public void writeFile(String filePath, int max){
        try {
            FileWriter writer = new FileWriter(filePath, false);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("Giá trị lớn nhất là: " + max);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        MaxNumber readAndWriteFile = new MaxNumber();
        Scanner scanner =new Scanner(System.in);
        System.out.println(" Nhập đường dẫn file nhập: ");
        String pathInput= scanner.nextLine();
        List<Integer> numbers = readAndWriteFile.readFile(pathInput);
        int maxValue = findMax(numbers);
        System.out.println(" Nhập đường dẫn file nhập: ");
        String pathOutput= scanner.nextLine();
        readAndWriteFile.writeFile(pathOutput,maxValue);
    }
}
