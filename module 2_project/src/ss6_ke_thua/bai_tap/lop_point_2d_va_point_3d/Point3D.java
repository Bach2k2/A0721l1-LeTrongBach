package ss6_ke_thua.thuc_hanh.lop_point_2d_va_point_3d;

public class Point3D extends Point2D {
    private float z;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {
        x = 3;
        y = 5;
        z = 8;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public float[] getXYZ() {
        float [] arr=new float[3];
        arr[0] = x;
        arr[1] = y;
        arr[2] = z;
        return arr;
    }
    @Override
    public String toString() {
        return "Point3D{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
