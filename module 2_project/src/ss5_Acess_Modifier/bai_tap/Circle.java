package ss5_Acess_Modifier.bai_tap;

public class Circle {
        private double radius;
        private String color;

        public Circle()
        {
            radius=10.0;
            color="red";
        }
        public Circle(double r)
        {
            this.radius=r;
        }
        protected double getRadius() {
            return radius;
        }
        double getArea()
        {
            return this.radius*this.radius*Math.PI;
        }
}
class Main
{
    public static void main(String[] args) {
        Circle circle1=new Circle();
        Circle circle2=new Circle(20.0);
        System.out.println("Đường tròn 1 có R: " + circle1.getRadius()+"; có diện tích: "+ circle1.getArea());
        System.out.println("Đường tròn 2 có R: "+ circle2.getRadius()+"; có diện tích: "+ circle2.getArea());
    }
}
