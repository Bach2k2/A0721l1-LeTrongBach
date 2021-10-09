package ss4_class_object.thuc_hanh;

public class Rectangle {
    double width;
    double height;
    public Rectangle(double width,double height)
    {
        this.width=width;
        this.height=height;
    }
    public double getArea()
    {
        return this.height*this.width;
    }
    public double getPerimeter()
    {
        return (this.height+this.width)*2;
    }
    public String display()
    {
        return "Rectangle{"+"width= " + this.width+", height= "+ this.height +"}";
    }
}
