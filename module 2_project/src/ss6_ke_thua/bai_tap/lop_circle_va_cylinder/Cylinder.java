package ss6_ke_thua.thuc_hanh;

public class Cylinder extends Circle {
    double height;

    public Cylinder()
    {
        radius=10;
        color="yellow";
        height=8;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume()
    {
        return getArea()*height;
    }
}
