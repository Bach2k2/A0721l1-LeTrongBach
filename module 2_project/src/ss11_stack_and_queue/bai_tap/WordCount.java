package ss11_stack_and_queue.bai_tap;

import java.util.*;

public class WordCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TreeMap<Character, Integer> myMap = new TreeMap<>();
        System.out.println("Nhập một chuỗi hay 1 từ: ");
        String myString = input.nextLine();
        char[] charArray = myString.toCharArray();

        for (int i = 0; i < myString.length(); i++) {
            if (charArray[i] >= 65 && charArray[i] <= 90) charArray[i] += 32;
            else {
                if (charArray[i] != ' ') {
                    int value = count(charArray, i);
                    myMap.put(charArray[i], value);
                }
            }
        }
         Set<Character> keys=myMap.keySet();
        for (Character key : keys) {
            System.out.println("Key: " + key + ": " + myMap.get(key));
        }
    }
    static int count(char[] arr,int index)
    {
        int count=0;
        for (int i=0;i< arr.length;i++)
        {
            if(arr[i]==arr[index]) count++;
        }
        return count;
    }
}
