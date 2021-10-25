package ss7_lop_truu_tuong_va_interface.bai_tap.colorable;

import ss7_lop_truu_tuong_va_interface.bai_tap.resizeable.Resizeable;

public class Square extends Shape implements Resizeable, Colorable {
    private double side;

    public Square()
    {
        this.side=Math.round(Math.random()*10);
    }
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
    @Override
    public void howToColor()
    {
        if(isFilled())
        {
            System.out.println("Color with 4 sides");
        }
    }
}
