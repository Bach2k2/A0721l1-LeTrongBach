package ss2_loop_in_java.bai_tap;

public class In20SNTDauTien {
    public static void main(String[] args) {
        System.out.println("20 Số nguyên tố đầu tiên");
        int number=2;
        int count =0;
        do {
            int check =1;
                for (int i = 2; i <= Math.sqrt(number); i++) {
                    if (number % i == 0) {
                        check = 0;
                        break;
                    }
                }
            if (check == 1) {
                count++;
                System.out.print(number + ", ");
            }
          number++;
        }while (count<20);
    }
}
