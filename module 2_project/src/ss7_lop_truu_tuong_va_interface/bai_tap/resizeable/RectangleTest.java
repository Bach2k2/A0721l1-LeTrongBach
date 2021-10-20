package ss7_lop_truu_tuong_va_interface.bai_tap.resizeable;

import ss7_lop_truu_tuong_va_interface.bai_tap.colorable.Rectangle;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle[] rectangles=new Rectangle[10];
        long percent;
        for(int i=0;i<10;i++)
        {
            System.out.println("Rectangle "+(i+1));
            rectangles[i] = new Rectangle();
            rectangles[i].setWidth(Math.random()*50);
            rectangles[i].setLength(Math.random()*50);
            System.out.println("Before resize: ");
            System.out.println(rectangles[i].toString());
            percent=Math.round(Math.random()*100);
            rectangles[i].resize(percent);
            System.out.println("The 4 side of this rectangle increases with "+ percent+ "%");
            System.out.println("After resize: ");
            System.out.println(rectangles[i].toString());
            System.out.println("\n");
        }
    }
}
