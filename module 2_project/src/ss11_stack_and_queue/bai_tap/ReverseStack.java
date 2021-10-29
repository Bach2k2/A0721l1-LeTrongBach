package ss11_stack_and_queue.bai_tap;

import java.util.Scanner;
import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử mảng nguyên");
        int amount = input.nextInt();
        int[] myArray = new int[amount];
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1) + ": ");
            int value = input.nextInt();
            myArray[i] = value;
        }
        reverseIntegerArray(myStack, myArray);
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + "\t");
        }

        // Mảng kí tự:
        System.out.println("\nNhập string cần đảo: ");
        input.nextLine();
        String myString=input.nextLine();

        Stack<Character> wStack = new Stack<>();
        String reversedString=reverseString(wStack, myString);
        System.out.println("Chuỗi sau khi đảo ngược:"+ reversedString);
    }

    public static void reverseIntegerArray(Stack<Integer> stack, int[] array) {
        for (int i = 0; i < array.length; i++) {
            stack.push(array[i]);
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }
    }

    public static String reverseString(Stack<Character> stack, String string) {
        for (int i = 0; i < string.length(); i++) {
            stack.push(string.charAt(i));
        }
        String newString="";
        for (int i = 0; i <string.length(); i++)newString += stack.pop();
        return newString;
    }

}
