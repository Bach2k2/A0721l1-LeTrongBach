package ss3_array.thuc_hanh;
import java.util.Scanner;
public class FindMaxEle {
    public static void main(String[] args) {
        int size;
        System.out.print("Enter a size:");
        Scanner scanner = new Scanner(System.in);
        size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter value: " + (i + 1));
            array[i] = scanner.nextInt();
        }
        System.out.println("In ra mảng: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println("\nMax of array: " + maxOfAll(array));
    }

    static int maxOfAll(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) max = array[i];
        }
        return max;
    }
}

