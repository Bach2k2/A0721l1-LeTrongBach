package ss1_intoduction_to_java.thuc_hanh;

import java.util.Scanner;

public class BmiCalculator {
    public static void main(String[] args) {
        System.out.println("\nChào mừng đến vs máy tính BMI");
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nNhập khối lg cơ thể");
        int weight = scanner.nextInt();
        System.out.println("\n Nhập chiều cao cơ thể: ");
        int height = scanner.nextInt();
        float bmi = weight / (height * height);
        if (bmi < 18.5) System.out.println("Underweight");
        else if (bmi < 25) System.out.println("Normal");
        else if (bmi < 30) System.out.println("OverWeight");
        else {
            System.out.println("Obese");
        }
    }
}
