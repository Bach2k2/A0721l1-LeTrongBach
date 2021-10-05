package ss2_loop_in_java.bai_tap;

public class InSNTNho100 {
    public static void main(String[] args) {
        System.out.println("Các số nguyên tố nhỏ hơn 100:");
        int number = 2;

        do {
            int check=1;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    check = 0;
                    break;
                }
            }
            if (check == 1) {
                System.out.print(number+", ");
            }
            number++;
        } while (number < 100);
    }
}
