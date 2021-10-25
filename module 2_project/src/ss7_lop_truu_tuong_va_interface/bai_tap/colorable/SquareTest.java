package ss7_lop_truu_tuong_va_interface.bai_tap.colorable;

public class SquareTest {
    public static void main(String[] args) {
        Square[] squares = new Square[10];
        for (int i = 0; i < 10; i++) {
            squares[i] = new Square();
            squares[i].setColor(squares[i].colorsShelve[(int) Math.round(Math.random() * 4)]);
            squares[i].setFilled(true);
            System.out.println(squares[i].toString());
            squares[i].howToColor();
        }
    }
}
