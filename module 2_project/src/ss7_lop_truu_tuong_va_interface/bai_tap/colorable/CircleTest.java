package ss7_lop_truu_tuong_va_interface.bai_tap.colorable;

public class CircleTest {
    public static void main(String[] args) {
       Circle[] circles=new Circle[10];
       for(int i=0;i<10;i++)
       {
           circles[i]=new Circle();
           System.out.println("Circle "+(i+1));
           circles[i].setFilled(circles[i].boolSet[(int) Math.round(Math.random())]);
           circles[i].setColor(circles[i].colorsShelve[(int) Math.round(Math.random()*4)]);
           System.out.println(circles[i].toString());
           circles[i].howToColor();
           System.out.println("\n");
       }
    }
}
