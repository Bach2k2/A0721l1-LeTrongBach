package ss13_thuat_toan_sap_xep.bai_tap;


import java.util.LinkedList;
import java.util.Scanner;

public class FindMaxSubsequenceString {
    public static void main(String[] args) {
        LinkedList<Character> maxList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String str = scanner.nextLine();
        LinkedList<Character> tempList = new LinkedList<>();
        for (int i = 0; i < str.length() - 1; i++) {
            tempList.clear();
            tempList.add(str.charAt(i));
            for (int j = i+1; j < str.length(); j++) {
                if (str.charAt(j) > tempList.getLast()) tempList.add(str.charAt(j));
            }
            if (tempList.size() > maxList.size()) {
                maxList.clear();
                maxList.addAll(tempList);
            }
        }
        System.out.println("Chuỗi dài nhất: ");
        for (Character ch:maxList) {
            System.out.print(ch);
        }
    }

}
