package ss6_ke_thua.thuc_hanh.lop_point_2d_va_point_3d;

public class Point2DTest {
    public static void main(String[] args) {
        Point2D pointA=new Point2D();
        System.out.println(pointA.getXY()[0]+" "+pointA.getXY()[1]);

        Point2D pointB= new Point2D(7,9);
        System.out.println(pointB.toString());
    }
}
