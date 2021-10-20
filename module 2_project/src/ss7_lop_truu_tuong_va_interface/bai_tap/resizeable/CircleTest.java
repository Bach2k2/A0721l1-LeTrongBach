package ss7_lop_truu_tuong_va_interface.bai_tap.resizeable;

import ss7_lop_truu_tuong_va_interface.bai_tap.colorable.Circle;

public class CircleTest {
    public static void main(String[] args) {
        Circle[] circles=new Circle[10];
        double percent;
        for (int i=0;i<10;i++)
        {
            circles[i]=new Circle();
            System.out.println("Circle "+(i+1));
            circles[i].setRadius(Math.random()*20);
            System.out.println("Before resize: ");
            System.out.println(circles[i].toString());
            percent=Math.random()*100;
            circles[i].resize(percent);
            System.out.println("After resize: ");
            System.out.println(circles[i].toString());
            System.out.println("\n");
        }
    }

}
