package ss7_lop_truu_tuong_va_interface.bai_tap.resizeable;

import ss7_lop_truu_tuong_va_interface.bai_tap.colorable.Shape;

public class Square extends Shape implements Resizeable{
    private double side;

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }
    public void resize(double percent)
    {
        this.side+=this.side*percent/100;
    }
}
