package ss7_lop_truu_tuong_va_interface.bai_tap.resizeable;


import ss7_lop_truu_tuong_va_interface.bai_tap.colorable.Square;

public class SquareTest {
    public static void main(String[] args) {
        Square[] squares=new Square[10];
        long percent;
        for(int i=0;i<10;i++)
        {
            System.out.println("Square "+(i+1));
            squares[i]=new Square();
            squares[i].setSide(Math.random()*50);
            System.out.println("Before resize: ");
            System.out.println(squares[i].toString());
            percent=Math.round(Math.random()*100);
            squares[i].resize(percent);
            System.out.println("The side of this square increases with "+ percent+ "%");
            System.out.println("After resize: ");
            System.out.println(squares[i].toString());
            System.out.println("\n");
        }
    }
}
