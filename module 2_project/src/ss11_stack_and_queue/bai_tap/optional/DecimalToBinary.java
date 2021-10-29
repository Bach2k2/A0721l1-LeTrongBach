package ss11_stack_and_queue.bai_tap.optional;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        Stack<Integer> myStack=new Stack<>();
        Scanner input=new Scanner(System.in);
        System.out.println("Nhập số ở hệ thập phân");
        int number=input.nextInt();
        int decimal=number;
        while (number!=0)
        {
            int remainder=number%2;
            myStack.push(remainder);
            number/=2;
        }
        String binary="";
        while (!myStack.empty())
        {
            binary+=myStack.pop();
        }
        System.out.printf("%d = %s (B) ",decimal,binary);
    }
}
