package ss7_lop_truu_tuong_va_interface.thuc_hanh.circle;

public class Circle {
    public double radius;
    public String color;
    public boolean filled;

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public Circle() {
        radius = 10.0;
        color = "red";
        filled = true;
    }

    public Circle(double r) {
        this.radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }
}
