package ss6_ke_thua.thuc_hanh.lop_point_va_moveable_point;

public class MoveablePointTest {
    public static void main(String[] args) {
        MoveablePoint pointA=new MoveablePoint();
        pointA.setSpeed(5,5);
        System.out.println(pointA.toString() );
        pointA.setXY(10,11);
        pointA.move();
        System.out.println(pointA.toString());

        MoveablePoint pointB =new MoveablePoint(9,7,9,10);
        pointB.move();
        System.out.println(pointB.toString());
    }
}
