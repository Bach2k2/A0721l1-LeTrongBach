package ss6_ke_thua.thuc_hanh;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(9);
        circle.setColor("Grey");
        System.out.println(toString(circle));
    }

    public static String toString(Circle circle) {
        return "This circle has radius = " + circle.getRadius() +
                ", color:  " + circle.getColor() +
                ", Area = " + circle.getArea();
    }
}
