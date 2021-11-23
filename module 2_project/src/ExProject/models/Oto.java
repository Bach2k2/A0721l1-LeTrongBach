package ExProject.models;

public class Oto extends Vehicle{
    int seat;
    String type;

    public Oto(String ctrlSignal, String productLabel, int yearProduct, String owner, int seat, String type) {
        super(ctrlSignal, productLabel, yearProduct, owner);
        this.seat = seat;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Oto{" +
                "seat=" + seat +
                ", type='" + type + '\'' +
                ", ctrlSignal='" + ctrlSignal + '\'' +
                ", productLabel='" + productLabel + '\'' +
                ", yearProduct=" + yearProduct +
                ", owner='" + owner + '\'' +
                '}';
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
