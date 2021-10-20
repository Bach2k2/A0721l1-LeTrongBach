package ss7_lop_truu_tuong_va_interface.thuc_hanh.circle;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {


    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    public int compareTo(ComparableCircle o) {
        if (getRadius() > o.getRadius()) return 1;
        else if (getRadius() < o.getRadius()) return -1;
        else return 1;
    }

    public String getColor() {
        return this.color;
    }

    public Boolean isFilled() {
        return filled;
    }

    @Override
    public String toString() {
        if (isFilled()) {
            return "Radius: " + getRadius() + ",is filled with color:" + getColor();
        } else {
            return "Radius: " + getRadius();
        }
    }
}
