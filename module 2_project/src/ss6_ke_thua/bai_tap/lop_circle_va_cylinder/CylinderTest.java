package ss6_ke_thua.thuc_hanh;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        cylinder.setRadius(13);
        cylinder.setColor("Blue");
        System.out.println(toString(cylinder));
    }

    public static String toString(Cylinder cylinder) {
        return "This cylinder has radius: " + cylinder.getRadius() +
                ", color:  " + cylinder.getColor() +
                ",height: " + cylinder.getHeight() +
                ", Volume: " + cylinder.getVolume();
    }
}
