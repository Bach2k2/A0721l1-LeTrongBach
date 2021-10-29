package ss11_stack_and_queue.bai_tap.optional;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class PalindromeString {
    public static void main(String[] args) {
        Stack myStack = new Stack();
        Queue myQueue = new ArrayDeque<>();
        String myString;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        myString = input.nextLine();
        char[] charArray = myString.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i]>=65&&charArray[i]<=90) charArray[i]+=32;
            myStack.push(charArray[i]);
            myQueue.add(charArray[i]);
        }
        String string1 = "";
        String string2 = "";
        while (!myStack.empty()) {
            string1 += myStack.pop();
        }
        while (!myQueue.isEmpty()) {
            string2 += myQueue.remove();
        }
        if(string1.compareTo(string2)!=0) System.out.println("Không phải chuỗi đối xứng");
        else System.out.println("Chuỗi đối xứng!");
    }
}
