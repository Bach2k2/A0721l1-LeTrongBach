package ExProject.models;

public class Motor extends Vehicle{
    float power;

    public Motor(String ctrlSignal, String productLabel, int yearProduct, String owner, float power) {
        super(ctrlSignal, productLabel, yearProduct, owner);
        this.power = power;
    }


    public float getPower() {
        return power;
    }

    public void setPower(float power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "power=" + power +
                ", ctrlSignal='" + ctrlSignal + '\'' +
                ", productLabel='" + productLabel + '\'' +
                ", yearProduct=" + yearProduct +
                ", owner='" + owner + '\'' +
                '}';
    }
}
