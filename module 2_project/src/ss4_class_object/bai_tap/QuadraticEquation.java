package ss4_class_object.bai_tap;

import java.util.Scanner;

public class QuadraticEquation {
   private double a,b,c;
    public QuadraticEquation(double a,double b ,double c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    public double getDiscriminant()
    {
        return getB()*getB() - 4*getA()*getC();
    }
    public double getRoot1()
    {
        return (-b-Math.sqrt(getDiscriminant()))/(2*a);
    }
    public double getRoot2()
    {
        return (-b+Math.sqrt(getDiscriminant()))/(2*a);
    }
    public void solveEquation()
    {
        if (getDiscriminant()>0)
        {
            System.out.println("Phương trình có 2 nghiệm: ");
            System.out.printf("x1=%f",getRoot1());
            System.out.printf("\nx2=%f",getRoot2());
        }
        else if (getDiscriminant()==0)
        {
            System.out.println("Phương trình có nghiệm kép: ");
            System.out.printf("x1=x2=%f",getRoot1());
        }
        else {
            System.out.println("Phương trình vô nghiệm");
        }
    }


}
class MainQuadraticEquation
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      //  System.out.println("Cho 1 đối tượng: ");
        System.out.print("\nNhập hệ số a: ");
        double aDouble= scanner.nextDouble();
        System.out.print("\nNhập hệ số b: ");
        double bDouble= scanner.nextDouble();
        System.out.print("\nNhập hệ số c: ");
        double cDouble= scanner.nextDouble();
        QuadraticEquation quadraticEquation =new QuadraticEquation(aDouble,bDouble,cDouble);
        quadraticEquation.solveEquation();
    }
}
