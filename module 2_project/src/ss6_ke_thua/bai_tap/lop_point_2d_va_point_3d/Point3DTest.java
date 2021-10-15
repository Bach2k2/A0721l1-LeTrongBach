package ss6_ke_thua.thuc_hanh.lop_point_2d_va_point_3d;

public class Point3DTest {
    public static void main(String[] args) {
        Point3D pointC=new Point3D(6,7,8);
        System.out.println(pointC.toString());

        Point3D pointD=new Point3D();
        pointD.setXYZ(10,9,5);
        System.out.println(pointD.getXYZ()[0]);
        System.out.println("Tịnh tiến pointD: thêm 2 ");
        pointD.setXYZ(pointD.getX()*2, pointD.getY()*2, pointD.getZ()*2);
        System.out.println(pointD.toString());
    }
}
