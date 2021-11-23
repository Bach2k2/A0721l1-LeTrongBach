package ExProject.models;

public class Truck extends Vehicle{
    float weight;

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "weight=" + weight +
                ", ctrlSignal='" + ctrlSignal + '\'' +
                ", productLabel='" + productLabel + '\'' +
                ", yearProduct=" + yearProduct +
                ", owner='" + owner + '\'' +
                '}';
    }

    public Truck(String ctrlSignal, String productLabel, int yearProduct, String owner, float weight) {

        super(ctrlSignal, productLabel, yearProduct, owner);
        this.weight = weight;
    }
}

