package ss4_class_object.bai_tap;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed;
    boolean on;
    private double radius;
    private String color ;

    public Fan() {
        this.speed = SLOW;
        this.on = false;
        this.radius = 5;
        this.color ="blue";
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        String result;
        if (isOn()) {
            result = "Speed: "+getSpeed()+",Color: "+getColor()+", Radius:"+getRadius()+", Fan is on";
        } else {
            result = "Color: "+getColor()+", Radius:"+getRadius()+", Fan is off";
        }
        return result;
    }
}
