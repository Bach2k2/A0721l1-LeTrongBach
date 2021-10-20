package ss7_lop_truu_tuong_va_interface.bai_tap.colorable;

import ss7_lop_truu_tuong_va_interface.bai_tap.resizeable.Resizeable;

public class Rectangle extends Shape implements Colorable, Resizeable {
    private double width;
    private double length;

    public Rectangle() {
        this.width=1;
        this.length=10;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * this.length;
    }

    public double getPerimeter() {
        return 2 * (width + this.length);
    }

    @Override
    public String toString() {
        return "A Rectangle with width="
                + getWidth()
                + " and length="
                + getLength()
                + ", which is a subclass of "
                + super.toString();
    }
    @Override
    public void resize(double percent)
    {
        this.width+=this.width*percent/100;
        this.length+=this.length*percent/100;
    }
    public void howToColor()
    {
        if(isFilled())
        System.out.println("Color with 2 width side and 2 length side");
    }
}
