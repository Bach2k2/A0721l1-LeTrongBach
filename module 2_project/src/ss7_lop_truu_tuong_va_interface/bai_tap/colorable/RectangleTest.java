package ss7_lop_truu_tuong_va_interface.bai_tap.colorable;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle[] rectangle = new Rectangle[10];
        for (int i=0;i<10;i++) {
            System.out.println("Rectangle "+(i+1));
            rectangle[i]=new Rectangle();
            System.out.println(rectangle[i].toString());
            rectangle[i].setFilled(true);
            rectangle[i].howToColor();
            System.out.println("\n");
        }
    }
}
