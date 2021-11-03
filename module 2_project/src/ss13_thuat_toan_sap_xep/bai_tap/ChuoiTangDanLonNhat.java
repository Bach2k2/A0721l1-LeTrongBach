package ss13_thuat_toan_sap_xep.bai_tap;

import java.util.Objects;
import java.util.Scanner;

public class ChuoiTangDanLonNhat {
    public static void main(String[] args) {
        System.out.println("Nhập một chuỗi bất kì: ");
        Scanner input=new Scanner(System.in);
        String str;
        do {
           str= input.nextLine();
           if(str.equals(" ")) System.out.println("Mời nhập lại");
        }while (Objects.equals(str, ""));

        // Chuyển chuỗi qua một mảng kí tự
        char charArr[]=str.toCharArray();

        //Chuỗi choosenOne sẽ là chuỗi dài nhất
        String choosenOne="";

        for (int i=0;i< charArr.length;i++)
        {
            //Chuỗi temp sẽ xét xem chọn kí tự nào đầu tiên sẽ sinh ra chuỗi dài nhất

            String temp="";
            //Kí tự phía trước
            int before=i;
            //Kí tự phía sau
            int after=before+1;
            // temp chứa tạm thời charArr(...);
            temp+=charArr[before];
            while(after < charArr.length)
            {
                if(charArr[before]<charArr[after]) {
                    System.out.printf("\n lần %d  before= %c, after=%c",i+1,charArr[before],charArr[after]);
                    temp += charArr[after];
                    before=after;
                }
                after++;
            }
            if (temp.length()>choosenOne.length()) choosenOne=temp;
            System.out.println("\n-------------------------------");
        }


        System.out.println("\nChuỗi con lớn nhất: "+ choosenOne);
    }
}
