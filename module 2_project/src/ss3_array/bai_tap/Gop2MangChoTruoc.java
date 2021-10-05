package ss3_array.bai_tap;

public class Gop2MangChoTruoc {
    public static void main(String[] args) {
        //    System.out.println("Nhập mảng thứ nhất");
        String[] arrA = {"Mai", "Chi", "Binh", "Chinh"};
        String[] arrB = {"Linda", "Johny", "Royle"};
        String[] arrC;
        arrC = match2Arr(arrA, arrB);
        System.out.println("Mảng kết hợp 2 mảng A, B: ");
        for (int i = 0; i < arrC.length; i++) {
            System.out.println(arrC[i] + " ");
        }
    }

    public static String[] match2Arr(String[] A, String[] B) {
        String[] C = new String[A.length + B.length];
        int i=0;
        while (i<C.length) {
            for (int j = 0; j < A.length; j++) {
                C[i] = A[j];
                i++;
            }
            for (int j = 0; j < B.length; j++) {
                C[i] = B[j];
                i++;
            }
        }
        return C;
    }
}
